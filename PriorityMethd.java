public class PriorityMethd extends Thread{
    public void run(){
        System.out.println("child thread priority= "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Thread.currentThread().setPriority(MAX_PRIORITY);
        PriorityMethd t = new PriorityMethd();
        // t.setPriority(MIN_PRIORITY);
        t.start();
        System.out.println("main thread priority= "+Thread.currentThread().getPriority());
    }
}
//windows not support priority