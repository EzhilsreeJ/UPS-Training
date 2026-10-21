package JavaFiles;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is running.");

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted.");
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("Thread 1 is resumed.");
            }
        });

        Thread t2 = new Thread(() -> {
            // Ensure Thread 1 has entered the waiting state
            synchronized (lock) {
                while (t1.getState() != Thread.State.WAITING) {
                    try {
                        lock.wait(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println("Thread 2 is running.");
                lock.notify();
                System.out.println("Thread 2 has notified.");
            }
        });

        t1.start();
        t2.start();
    }
}
