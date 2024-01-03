// public class SleepMethod {
//     public static void main(String[] args) throws Exception {
//         for(int i=1;i<=5;i++){
//             Thread.sleep(1000);
//             System.out.println(i);
//         }
//     }
// }


// public class SleepMethod {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             try {
//                 Thread.sleep(1000);
//                 System.out.println(i);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }


public class SleepMethod extends Thread {
    public void run(){
        for(int i=0;;i++){
            for(int j = 1;j<=59;j++){
                try {
                    Thread.sleep(1000);
                    System.out.println(i+" : "+j);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
        }
    }
    public static void main(String[] args) {
        SleepMethod t = new SleepMethod();
        t.start();
    }
}
