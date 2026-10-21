package JavaFiles;

class TaskA implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Task A interrupted.");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Thread A is running.");
    }
}

class TaskB implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread B is running.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread threadA = new Thread(new TaskA());
        Thread threadB = new Thread(new TaskB());

        threadA.start();
        threadB.start();
    }
}
