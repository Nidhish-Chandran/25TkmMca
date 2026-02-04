import java.util.Scanner;
class Mensuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        float length = sc.nextFloat();
        System.out.println("Enter the Breadth of Rectangle");
        float breadth = sc.nextFloat();
        System.out.println("Enter the radius of circle");
        float radius = sc.nextFloat();
        float Rarea = length * breadth;
        float Rperimeter = 2*(length + breadth);
        float Carea = (float)22/7 * (radius*radius);
        float CCircumference = 2 * (float)22/7 * radius;
        System.out.println("\tRectangle:\nArea="+Rarea+"\nPerimeter="+Rperimeter);
        System.out.println("\tCircle:\nArea="+Carea+"\nCircumference="+CCircumference);
    }
}