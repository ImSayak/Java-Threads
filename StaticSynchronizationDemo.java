//synchonize mathod

class BookTheaterSeat {
    static int total_seats = 20;

    static synchronized void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " Seat Booked Successfully");
            total_seats -= seats;
            if (total_seats < 0)
                total_seats = 0;
            System.out.println("Seats Left: " + total_seats);
            System.out.println();
        } else {
            System.out.println("Sorry " + seats + " seats can't be booked \nOnly " + total_seats + " Seats Left!");
            System.out.println();
        }
    }
}

class MyThread1 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}
class MyThread2 extends Thread{
    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b, int seats){
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

public class StaticSynchronizationDemo{
    public static void main(String[] args) throws Exception {
        BookTheaterSeat b1 = new BookTheaterSeat();
        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1,6);
        t2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();
        MyThread1 t3 = new MyThread1(b2,9);
        t3.start();
        MyThread2 t4 = new MyThread2(b2,5);
        t4.start();
    }
}