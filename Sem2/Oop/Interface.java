import java.util.Scanner;

// Interface for Loan
interface Loan {
    double calculateEMI(double principal, double rate, int months);
}

// Interface for Insurance
interface Insurance {
    double calculateInsurance(double price);
}

// Vehicle class implementing both interfaces
class Vehicle implements Loan, Insurance {

    String vehicleNumber;
    String brand;
    double price;

    // Method to add vehicle details
    void addDetails(String vno, String brand, double price) {
        this.vehicleNumber = vno;
        this.brand = brand;
        this.price = price;
    }

    // EMI Calculation
    public double calculateEMI(double P, double annualRate, int N) {
        double R = annualRate / (12 * 100); // monthly interest rate
        double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
        return emi;
    }

    // Insurance Calculation (example: 5% of price)
    public double calculateInsurance(double price) {
        return price * 0.05;
    }

    // Display details
    void display() {
        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Vehicle Details");
            System.out.println("2. Calculate Loan EMI");
            System.out.println("3. Calculate Insurance");
            System.out.println("4. Display Vehicle Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Vehicle Number: ");
                    String vno = sc.nextLine();

                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    v.addDetails(vno, brand, price);
                    break;

                case 2:
                    System.out.print("Enter Loan Amount: ");
                    double P = sc.nextDouble();

                    System.out.print("Enter Annual Interest Rate (%): ");
                    double rate = sc.nextDouble();

                    System.out.print("Enter Duration (months): ");
                    int N = sc.nextInt();

                    double emi = v.calculateEMI(P, rate, N);
                    System.out.println("EMI = " + emi);
                    break;

                case 3:
                    double insurance = v.calculateInsurance(v.price);
                    System.out.println("Insurance Premium = " + insurance);
                    break;

                case 4:
                    v.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}