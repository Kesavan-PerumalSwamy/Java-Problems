package Arrays;

import java.util.*;

public class MultiArr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int r=input.nextInt();
        System.out.println("Enter the Number of Columns");
        int c=input.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                    arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
