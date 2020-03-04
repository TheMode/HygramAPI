package fr.hygram.timer;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TimerManager {

    private static final AtomicInteger COUNTER = new AtomicInteger();
    private List<Task> tasks = new CopyOnWriteArrayList<>();

    public int addTask(TaskRunnable runnable, int milliseconds, int maxCallCount) {
        int id = COUNTER.incrementAndGet();
        runnable.setId(id);

        Task task = new Task(runnable, milliseconds, maxCallCount);
        this.tasks.add(task);

        return id;
    }

    public int addRepeatingTask(TaskRunnable runnable, int milliseconds) {
        return addTask(runnable, milliseconds, 0);
    }

    public int addDelayedTask(TaskRunnable runnable, int milliseconds) {
        return addTask(runnable, milliseconds, 1);
    }

    public void removeTask(int taskId) {
        synchronized (tasks) {
            this.tasks.removeIf(task -> task.getId() == taskId);
        }
    }

    public void update() {
        long time = System.currentTimeMillis();

        synchronized (tasks) {
            Iterator<Task> iterator = tasks.iterator();
            while (iterator.hasNext()) {
                Task task = iterator.next();

                int ms = task.getMilliseconds();
                long lastUpdate = task.getLastUpdateTime();
                boolean hasCooldown = time - lastUpdate < ms;
                if (!hasCooldown) {
                    TaskRunnable runnable = task.getRunnable();
                    int maxCallCount = task.getMaxCallCount();
                    int callCount = runnable.getCallCount() + 1;
                    runnable.setCallCount(callCount);

                    runnable.run();

                    task.refreshLastUpdateTime(time);

                    if (callCount == maxCallCount) {
                        iterator.remove();
                    }
                }
            }
        }
    }

}
