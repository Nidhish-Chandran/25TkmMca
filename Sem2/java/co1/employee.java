package student;
import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee ID");
		String empid = sc.nextLine();
		System.out.println("Enter the Basic Pay");
		float bp = sc.nextFloat();
		System.out.println("Enter the HRA");
		float hra = sc.nextFloat();
		System.out.println("Enter the DA");
		float da = sc.nextFloat();
		float gs= bp+hra+da;
		float ns = gs-(gs*12/100);
		System.out.println("Employee salary detailes");
		System.out.println("Employeeid : "+empid+"\nGross salary : "+gs+"\nNet Salary : "+ns);
	}

}
