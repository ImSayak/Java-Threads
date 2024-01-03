class YieldMethod extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+ Thread.currentThread().getName());
        }
        
    }
    public static void main(String[] args) {
        YieldMethod t = new YieldMethod();
        t.start();

        Thread.yield();
        for(int i=1;i<=10;i++){
            System.out.println(i+" "+ Thread.currentThread().getName());
        }
    }
}