package Methods;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number=input.nextInt();
        System.out.println(oddeven(Number));

    }
    static String oddeven(int Number){
        if(Number%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }

    }
}
