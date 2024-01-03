// public class BasicMethod {
//     public static void main(String[] args) {
//         System.out.println(Thread.currentThread().getName()); // current thread is main thread
//         Thread.currentThread().setName("sayak");// we change the name of main thread
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(10/0); // it shows Exception in thread "sayak" java.lang.ArithmeticException

//     }
// }


public class BasicMethod extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName()); // 2nd print: Thread-0 <-- JVM provide name
        // System.out.println("thread task");
    }
    public static void main(String[] args) {
        BasicMethod t = new BasicMethod();
        BasicMethod t1 = new BasicMethod();
        t.start();
        System.out.println(t.isAlive());//return true
       
        t1.start();
        t1.setName("t1 thread");//we can set name from here also
        System.out.println(Thread.currentThread().getName()); // 1st print: main thread
        System.out.println(Thread.currentThread().isAlive());// return true
    }                                                         
}
