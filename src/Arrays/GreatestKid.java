//1431. Kids With the Greatest Number of Candies
package Arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class GreatestKid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Kids: ");
        int n=input.nextInt();
        int[] candies=new int[n];
        System.out.println("Enter the Number of Extra candies : ");
        int extraCandies=input.nextInt();
        for(int i=0; i<n;i++){
            candies[i]=input.nextInt();
        }
        Arrays.sort(candies);
        int max=candies[n-1];

        System.out.println("Maximum Value : "+max);
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=candies[i]+extraCandies;
        }
        System.out.print("Added ExtraCandies With sorted Array : ");
        System.out.println(Arrays.toString(temp));
        boolean[] result=new boolean[n];
        for(int i=0;i<n;i++){
            if(temp[i]>=max){
                result[i]=true;
            }
            else{
                result[i]=false;
            }
        }
        System.out.print("Resulted Array: ");
        System.out.println(Arrays.toString(result));
    }
}
