public class Testt implements Runnable {
    public void run(){
        System.out.println("tread task 2");
    }
    public static void main(String[] args) {
        Testt t = new Testt();
        Thread th = new Thread(t);//because start mathod is available in the Thread class
        th.start();
    }
}
