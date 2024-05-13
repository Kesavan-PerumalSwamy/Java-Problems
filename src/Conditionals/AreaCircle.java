package Conditionals;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        //A=pi*r*r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("The area of the circle is " + area);

    }
}
