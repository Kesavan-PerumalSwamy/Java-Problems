//Write a program to print whether a number is even or odd, also take input from the user.

package First.Java.assignment;
import java.util.Scanner;
import java.lang.*;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int Value=input.nextInt();
        if(Value%2==0){
            System.out.println(Value +" is Even");
        }
        else{
            System.out.println(Value +" is Odd");
        }

    }
}
