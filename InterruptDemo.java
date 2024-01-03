public class InterruptDemo extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        InterruptDemo t = new InterruptDemo();
        t.start();
        t.interrupt();
    }

}

