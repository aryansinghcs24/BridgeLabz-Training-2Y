public class Background_Job_Execution {
    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Background task started.");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Task interrupted.");
            }
            System.out.println("Background task finished.");
        };

        Thread thread = new Thread(job);
        thread.start();

        System.out.println("Main thread is free to do other work.");
    }
}
