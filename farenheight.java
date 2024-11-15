
package Anisul_sir;

import java.util.Scanner;


public class farenheight {
    
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double C,F;
        
//        System.out.print("Enter base:");
//        base=input.nextDouble();
        
        System.out.print("Enter c:");
        C=input.nextDouble();
        
        F=(9.0/5.0)*C+32;
        System.out.print("Faren height is :"+F);
}
}