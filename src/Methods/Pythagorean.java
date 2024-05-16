package Methods;

import java.util.Scanner;

public class Pythagorean {
    static boolean isPythagoreanTriplet(int a,int b,int c){
        int max=Math.max(a,Math.max(b,c));
        int x,y;
        if(max==a){
            x=b;
            y=c;
        }
        else if(max==b){
            x=a;
            y=c;
        }
        else{
            x=a;
            y=b;
        }
        return max*max==x*x+y*y;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the values : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println(isPythagoreanTriplet(a,b,c));
    }
}
