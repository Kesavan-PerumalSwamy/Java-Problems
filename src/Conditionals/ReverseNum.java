package Conditionals;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int Number=input.nextInt();
        int Reverse=0;
        while(Number>0){
            int remainder=Number%10;
            Reverse=Reverse*10+remainder;
            Number /=10;

        }
        System.out.println(Reverse);
    }

}
