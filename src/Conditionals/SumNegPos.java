//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
//odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters
//a zero
package Conditionals;

import java.util.Scanner;

public class SumNegPos {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int x=input.nextInt();
        int odd=0,even=0,neg=0;
        while(x!=0){
            if(x<0){
                neg=neg+x;
            }else if(x>0 && x%2==0){
                even=even+x;
            }
            else if(x>0 && x%2!=0){
                odd=odd+x;
            }
            x=input.nextInt();
        }
        System.out.println("Sum of Negative Number Are : "+ neg);
        System.out.println("Sum of Positive Even Number Are : "+ even);
        System.out.println("Sum of Positive Odd Number Are : "+ odd);
    }
}
