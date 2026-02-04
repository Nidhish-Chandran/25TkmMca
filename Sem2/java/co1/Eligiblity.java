import java.util.Scanner; 
class Eligilibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the person's age,attendence percentage and internal marks:");
        int age=sc.nextInt();
        float attendence = sc.nextFloat();
        float internal_mark = sc.nextFloat();
        String EligibleVote =(age>=18)?"Eligible":"Not Eligible";
        String ExamEligible = (attendence>=75)&&(internal_mark>=40)?"Eligible":"Not Eligible";
        System.out.println("The person is "+EligibleVote+" to vote.");
        System.out.println("The person is "+ExamEligible+" to write exam.");
    }
}