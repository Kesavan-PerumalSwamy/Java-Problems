//1672. Richest Customer Wealth
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RichWealth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r=input.nextInt();
        System.out.println("Enter the column: ");
        int c =input.nextInt();
        int[][] accounts=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                accounts[i][j]=input.nextInt();
            }
        }

        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int maxWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                maxWealth+=accounts[i][j];
            }
            if(wealth<maxWealth){
                wealth=maxWealth;
            }
        }

        System.out.println(wealth);
        System.out.println(Arrays.deepToString(accounts));
    }
}
