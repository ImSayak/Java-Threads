// public class JoinMehod extends Thread {
//     public void run(){
//         try {
//             for(int i=1;i<=5;i++){
//                 Thread.sleep(500);
//                 System.out.println(i+" "+Thread.currentThread().getName());
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
        
//     }
//     public static void main(String[] args) throws InterruptedException {
//         JoinMehod t = new JoinMehod();
//         t.start();
//         t.join();
//         try {
//             for(int i=1;i<=5;i++){
//                 Thread.sleep(500);
//                 System.out.println(i+" "+Thread.currentThread().getName());
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }



public class JoinMehod extends Thread {
    static Thread mainthread;
    public void run(){
        try {
            mainthread.join();

            for(int i=1;i<=5;i++){
                Thread.sleep(500);
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        mainthread = Thread.currentThread();
        JoinMehod t = new JoinMehod();
        t.start();
        try {
            for(int i=1;i<=5;i++){
                Thread.sleep(500);
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
