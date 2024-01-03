public class InterruptedMethod extends Thread {
    public void run() {
        // System.out.println(Thread.interrupted()); // change status from : true -> false
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println(Thread.interrupted());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InterruptedMethod t = new InterruptedMethod();
        t.start();
        t.interrupt();
    }

}
