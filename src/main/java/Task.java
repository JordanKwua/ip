public class Task {
    protected String task;
    protected boolean isDone;


    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getTask() {
        return task;
    }

    public void markAsDone() {

        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String toString() {
       return "[" + getStatusIcon() + "]" + task;
    }
}
