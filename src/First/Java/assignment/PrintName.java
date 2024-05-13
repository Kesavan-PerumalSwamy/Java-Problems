//Take name as input and print a greeting message for that particular name.
package First.Java.assignment;
import java.util.*;
import java.lang.*;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name=sc.nextLine();
        System.out.println("Welcome "+ Name);
    }
}
