//synchonize mathod

class BookTheaterSeat {
    int total_seats = 10;

    synchronized void bookSeat(int seats) {
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

// Using synchronize block

// class BookTheaterSeat {
//     int total_seats = 10;

//     void bookSeat(int seats) {
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());
//         synchronized (this) { // t\here this use for referance of object
//             if (total_seats >= seats) {
//                 System.out.println(seats + " Seat Booked Successfully");
//                 total_seats -= seats;
//                 if (total_seats < 0)
//                     total_seats = 0;
//                 System.out.println("Seats Left: " + total_seats);
//                 System.out.println();
//             } else {
//                 System.out.println("Sorry " + seats + " seats can't be booked \nOnly " +
//                         total_seats + " Seats Left!");
//                 System.out.println();
//             }
//         }
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getName());

//     }
// }

public class SeatBookingShyncronization extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) throws Exception {
        b = new BookTheaterSeat();
        SeatBookingShyncronization p1 = new SeatBookingShyncronization();
        p1.seats = 5;
        p1.start();

        SeatBookingShyncronization p2 = new SeatBookingShyncronization();
        p2.seats = 3;
        p2.start();

        SeatBookingShyncronization p3 = new SeatBookingShyncronization();
        p3.seats = 4;
        p3.start();
    }
}