class Medical extends Thread {
    public void run(){
        try {
            System.out.println("Medical start");
            Thread.sleep(3000);
            System.out.println("Medical End");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread {
    public void run(){
        try {
            System.out.println("TestDrive start");
            Thread.sleep(2000);
            System.out.println("TestDrive End");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread {
    public void run(){
        try {
            System.out.println("OfficerSign start");
            Thread.sleep(2000);
            System.out.println("OfficerSign End");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class LicenceDemoJoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();

        TestDrive t = new TestDrive();
        t.start();
        t.join();

        OfficerSign os = new OfficerSign();
        os.start();
        os.join();

        System.out.println("Finally get Licence");

    }
}
