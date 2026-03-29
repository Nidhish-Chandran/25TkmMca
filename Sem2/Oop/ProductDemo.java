import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    double price;

    // Method to input product details
    void getData(Scanner sc) {
        System.out.print("Enter product code: ");
        pcode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        pname = sc.nextLine();

        System.out.print("Enter product price: ");
        price = sc.nextDouble();
    }

    // Method to display product details
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }
}

// Changed class name here
public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("Enter details for Product 1:");
        p1.getData(sc);

        System.out.println("\nEnter details for Product 2:");
        p2.getData(sc);

        System.out.println("\nEnter details for Product 3:");
        p3.getData(sc);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }

        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("\nProduct with lowest price:");
        lowest.display();

        sc.close();
    }
}