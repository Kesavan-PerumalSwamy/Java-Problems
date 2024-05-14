//Calculate Electricity Bill
package Conditionals;


import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Units : ");
        double Units=input.nextDouble();
        double billsTopay=0;
        if(Units<100){
            billsTopay=Units*0;
        }else if(Units>100 && Units<201){
            billsTopay=Units*1.5;
        }else if(Units>200 && Units<501){
            billsTopay=Units*5;
        }else{
            billsTopay=Units*6.6;
        }
        System.out.println("Your Electricity Bill is : "+billsTopay);
    }


}
