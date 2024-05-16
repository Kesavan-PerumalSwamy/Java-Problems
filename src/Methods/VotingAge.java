package Methods;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=input.nextInt();
        System.out.println(Age(age));
    }
    static String Age(int Age){
        String Vote;
        if(Age>=18){
             Vote="You Are Eligible to Vote!";

        }else{
             Vote="You Are Not Eligible to Vote!";
        }

        return Vote;
    }

}
