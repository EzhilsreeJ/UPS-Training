package JavaFiles;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Worker: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Worker was interrupted.");
                Thread.currentThread().interrupt();
            }
        });

        worker.start();

        try {
            // Main waits for worker to finish
            worker.join();
            System.out.println("Worker completed.");

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        Thread anotherWorker = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Second worker completed.");
            } catch (InterruptedException e) {
                System.out.println("Second worker was interrupted.");
                Thread.currentThread().interrupt();
            }
        });

        anotherWorker.start();

        anotherWorker.interrupt();
    }
}
