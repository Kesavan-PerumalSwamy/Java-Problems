package First.Java.assignment;

import java.util.Scanner;

public class CurrencyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the INR : ");
        int inr = sc.nextInt();
        double USD=inr*83.55;
        System.out.println("USD of "+ inr +" is "+USD);
    }
}
