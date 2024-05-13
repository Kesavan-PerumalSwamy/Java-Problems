package Conditionals;

import java.util.Scanner;

public class AlphaCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String ch =sc.nextLine();
       int n=sc.nextInt();
       char temp=ch.charAt(n);
       if(temp>='A' && temp<='Z'){
           System.out.println(temp);
       }
       if(temp>='a' && temp<='z'){
           System.out.println(temp);
       }
    }
}
