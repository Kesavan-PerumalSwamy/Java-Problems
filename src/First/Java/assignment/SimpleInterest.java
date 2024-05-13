//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package First.Java.assignment;
import java.util.*;
import java.lang.*;

public class SimpleInterest {
    public static void main(String[] args) {
        //A=P*R*T/100
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value For Principle :");
        double principal = sc.nextDouble();
        System.out.print("Enter the Value For Rate :");
        double rate = sc.nextDouble();
        System.out.print("Enter the Value For Time :");
        double time = sc.nextDouble();
        Double A;
        A=principal*rate*time/100;
        System.out.println("Simple Interest is "+A);
    }
}
