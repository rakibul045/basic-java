
package Anisul_sir;

import java.util.Scanner;




public class tringle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base,height,area;
        
        System.out.print("Enter base:");
        base=input.nextDouble();
        
        System.out.print("Enter heiggt:");
        height=input.nextDouble();
        
        area=0.5*base*height;
        System.out.print("Area of tringle:"+area);
    }
}
