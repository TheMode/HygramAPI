package fr.hygram.timer;

public class Task {

    private int id;

    private TaskRunnable runnable;
    private int milliseconds;

    private int maxCallCount;

    private long lastUpdateTime;

    public Task(TaskRunnable runnable, int milliseconds, int maxCallCount) {
        this.id = runnable.getId();

        this.runnable = runnable;
        this.milliseconds = milliseconds;
        this.maxCallCount = maxCallCount;
    }

    protected void refreshLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    protected long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public int getId() {
        return id;
    }

    public TaskRunnable getRunnable() {
        return runnable;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public int getMaxCallCount() {
        return maxCallCount;
    }

}
