// public class Test extends Thread {
//     public void run() {
//         System.out.println("THREAD TASK");
//     }

//     public static void main(String[] args) {
//         Test t = new Test();
//         t.start();
//     }
// }


//==== 1. single task with single thread ====//
// class MyThread extends Thread{
//     public void run(){
//         System.out.println("task 1");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }

//==== 2. single task with multiple thread ====//
// class MyThread extends Thread{
//     public void run(){
//         System.out.println("task 1");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();
//         MyThread t3 = new MyThread();
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

//==== 4. multiple task with multiple thread ====//
class MyThread1 extends Thread{
    public void run(){
        System.out.println("task 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("task 2");
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("task 3");
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();
    }
}