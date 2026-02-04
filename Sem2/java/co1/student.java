package student;
import java.util.Scanner;
public class student {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String sname = sc.nextLine();
		System.out.println("Enter the roll number of the student");
		int rollno = sc.nextInt();
		System.out.println("Enter the marks of the 5 subjects");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		System.out.println("Student detailes");
		System.out.println("Name:"+sname+"\nRollno:"+rollno+"\nTotal Mark"+(m1+m2+m3+m4+m5));
		
	}
	
	
}
