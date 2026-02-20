class Multi extends Thread {
    String task;

    Multi(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task);
        System.out.println(Thread.currentThread().getName());
    }
}

public class MultiTask {
    public static void main(String[] args) {
        Thread t1 = new Multi("t1 running");
        Thread t2 = new Multi("t2 running");
        Thread t3 = new Multi("t3 running");
        Thread t4 = new Multi("t4 running");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}