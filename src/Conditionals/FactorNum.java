//Input a number and print all the factors of that number (use loops)
package Conditionals;

import java.util.Scanner;

public class FactorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number=input.nextInt();
        System.out.println("All Factors are : ");
        for(int i=1; i<=Number; i++){
            if(Number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
