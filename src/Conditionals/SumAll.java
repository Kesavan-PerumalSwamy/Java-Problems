//Take integer inputs till the user enters 0 and print the sum of all numbers
package Conditionals;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int x=input.nextInt();
        while(x>0){
            sum =sum+x;
            x=input.nextInt();
        }
        System.out.println(sum);
    }
}
