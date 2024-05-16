package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrAdd {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println(a.length);
        int[] ans=new int[(a.length)*2];
        for(int i=0;i<a.length;i++){
            ans[i]=a[i];
            ans[i+a.length]=a[i];
        }
        System.out.println(Arrays.toString(ans));



    }
}
