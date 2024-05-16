package Methods;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Three Values : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int MaxAns=Maxi(a,b,c);
        int MinAns=Mini(a,b,c);
        System.out.println("Maximum Number Among these Three is : "+MaxAns);
        System.out.println("Minimum Number Among these Three is : "+MinAns);

    }
    static int Maxi(int a,int b,int c){
        int max=0;
        if(a>b){
            max=a;
        }else if(b>c){
            max=b;
        }
        else{
            max=c;
        }
       return max;
    }


static int Mini(int a,int b,int c){
        int mini=0;
        if(a<b){
            mini=a;
        }else if(b<c){
            mini=b;
        }
        else{
            mini=c;
        }
       return mini;
    }

}
