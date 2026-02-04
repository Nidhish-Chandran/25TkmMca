import java.util.Scanner;
class IntCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int data = sc.nextInt();
        // using ternary operator
        String pn = (data>0)?"Positive":"Negative"; 
        System.out.println("The given value "+data+" is "+pn);
        //using "if-else" conditional control statement
        if((data%2)==0)
            System.out.println("It's an Even Number");
        else
            System.out.println("It's an Odd Number");
        //using "Nested if" conditional control statement
        if((data%5)==0)
            if((data%11)==0)
                System.out.println("The given value "+data+" is Divisible by both 5 and 11");
            else
                System.out.println("The given value "+data+" is Divisible by 5 and not by 11");
        else
             if((data%11)==0)
                System.out.println("The given value "+data+" is Divisible by 11 and not by 5");
            else
                System.out.println("The given value "+data+" is not Divisible by 5 and not by 11");
    }
}