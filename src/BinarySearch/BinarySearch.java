package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of array elements in an array: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Target Value : ");
        int target=input.nextInt();
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

     int ans=  Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int[] arr,int  target){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
                else {
                 return mid;
                }
            }

        return -1;
    }
}
