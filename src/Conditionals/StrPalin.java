package Conditionals;

import java.util.*;
import java.lang.*;

public class StrPalin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=input.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is an palindrome");
        }
        else{
            System.out.println("It is not an palindrome");
        }
    }
}
