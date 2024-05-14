//Power in Java
package Conditionals;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Number=input.nextInt();
        System.out.println("Enter the Power : ");
        int power=input.nextInt();
        int temp=1;
        for(int i=1; i<=power; i++){
            temp=temp*Number;
        }
        System.out.println("Power of "+ Number +" is "+temp);
    }
}
