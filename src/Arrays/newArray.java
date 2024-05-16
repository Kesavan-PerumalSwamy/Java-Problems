package Arrays;

import java.util.*;
import java.util.Scanner;

public class newArray {
   static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        int n=input.nextInt();
        DemoArr(n);
    }
    static void DemoArr(int n){
        int[] arr=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
