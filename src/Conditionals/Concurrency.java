package Conditionals;

import java.util.Scanner;

public class Concurrency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Overall Number : ");
        int Number=input.nextInt();
        System.out.println("Enter the Number to Find the Concurrent : ");
        int X=input.nextInt();
        int temp=0;
        while(Number>0){
            int remainder=Number%10;
            if(remainder==X){
                temp+=1;
            }
            Number /=10;
        }
        System.out.println(temp);
    }
}
