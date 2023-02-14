public class OddEvenThreads {
    public static void main(String[] args) {
        // Create a Runnable object to display odd numbers
        Runnable oddRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println(i);
                }
            }
        };

        // Create a Runnable object to display even numbers
        Runnable evenRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(i);
                }
            }
        };

        // Create two threads using the Runnable objects
        Thread oddThread = new Thread(oddRunnable);
        Thread evenThread = new Thread(evenRunnable);

        // Start the threads
        oddThread.start();
        evenThread.start();
    }
}
