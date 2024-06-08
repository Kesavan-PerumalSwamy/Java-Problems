//1480. Running Sum of 1d Array
package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
        }
        int[] ans=new int[n];
        int temp=0;
        for(int i=0;i<nums.length;i++){

            ans[i]=temp+nums[i];
            temp=ans[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
