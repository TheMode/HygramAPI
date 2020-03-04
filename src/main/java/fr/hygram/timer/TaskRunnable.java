package fr.hygram.timer;

public abstract class TaskRunnable {

    private int id;
    private int callCount;

    public abstract void run();

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public int getCallCount() {
        return callCount;
    }

    protected void setCallCount(int callCount) {
        this.callCount = callCount;
    }

}
