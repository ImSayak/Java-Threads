public class DaemonThreadMethod extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());
        DaemonThreadMethod t = new DaemonThreadMethod();
        // DaemonThreadMethod t1 = new DaemonThreadMethod();

        t.setDaemon(true);
        t.start();
        // System.out.println(t.isDaemon());

        // t1.start();
        // System.out.println(t1.isDaemon());

    }
}
