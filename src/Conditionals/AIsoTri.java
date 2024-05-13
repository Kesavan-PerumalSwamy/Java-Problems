package Conditionals;
import java.util.*;
public class AIsoTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Base of Isosceles Triangle: ");
        double b=sc.nextDouble();
        System.out.println("Enter the Height of Isosceles Triangle: ");
        double h=sc.nextDouble();
        double Area=h*b/2;
        System.out.println("Area of Isosceles Triangle: "+Area);
    }
}
