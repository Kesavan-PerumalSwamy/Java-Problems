package Methods;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=input.nextInt();
        System.out.println(isPrime(n));

    }
}
