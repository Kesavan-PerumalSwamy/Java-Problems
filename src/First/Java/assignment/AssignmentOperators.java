package First.Java.assignment;
import java.util.Scanner;
import java.lang.*;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Operator(+,-,*,/)");
        char c = sc.next().charAt(0);
        if(c=='+'){
            System.out.println("The sum is "+(a+b));
        }
        else if(c=='-'){
            System.out.println("The subtraction is "+(a-b));
        }
        else if(c=='*'){
            System.out.println("The multiplication is "+(a*b));
        }
        else{
            System.out.println("The Divide is "+(a/b));
        }
    }
}
