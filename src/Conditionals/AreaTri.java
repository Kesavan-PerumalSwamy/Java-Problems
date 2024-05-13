package Conditionals;

import java.util.Scanner;

public class AreaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height of a Triangle: ");
        double h=sc.nextDouble();
        System.out.println("Enter the Base of a Triangel: ");
        double b=sc.nextDouble();
        double area=h*b/2;
        System.out.println("Area of a Triangle is "+area);
    }
}
