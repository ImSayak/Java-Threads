public class SleepDemo2 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+" "+ Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
    public static void main(String[] args) {
        SleepDemo2 t = new SleepDemo2();
        SleepDemo2 t1 = new SleepDemo2();
        t.start();
        t1.start();
        // t.run();// run() create mathod not thread
        // t1.run();// so here only main thread is called

    }
}
