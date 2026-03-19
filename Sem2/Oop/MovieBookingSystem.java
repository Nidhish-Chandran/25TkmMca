import java.util.Scanner;

// Shared Resource
class TicketBooking {
    private int availableTickets;

    TicketBooking(int tickets) {
        this.availableTickets = tickets;
    }

    // synchronized method
    synchronized void bookTicket(int num, String customerName) {
        System.out.println(customerName + " trying to book " + num + " tickets");

        if (num <= availableTickets) {
            System.out.println("Booking successful for " + customerName);
            availableTickets -= num;
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println("Booking failed for " + customerName + " (Not enough tickets)");
        }

        System.out.println("----------------------------------");
    }
}

// Thread class
class Customer extends Thread {
    TicketBooking booking;
    int tickets;
    String name;

    Customer(TicketBooking booking, String name, int tickets) {
        this.booking = booking;
        this.name = name;
        this.tickets = tickets;
    }

    public void run() {
        booking.bookTicket(tickets, name);
    }
}

// Main class
public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total tickets
        System.out.print("Enter total number of tickets: ");
        int totalTickets = sc.nextInt();

        TicketBooking booking = new TicketBooking(totalTickets);

        // Input number of customers (at least 2)
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least 2 customers to demonstrate multithreading.");
            return;
        }

        Customer[] customers = new Customer[n];

        sc.nextLine(); // clear buffer

        // Input customer details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter tickets required: ");
            int tickets = sc.nextInt();
            sc.nextLine(); // clear buffer

            customers[i] = new Customer(booking, name, tickets);
        }

        // Start threads (concurrent execution)
        for (int i = 0; i < n; i++) {
            customers[i].start();
        }

        sc.close();
    }
}