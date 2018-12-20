/**
 * Owen Valasek
 * Project - CH7PC2
 * Programming III - AP CS
 * 12/19/18
 */
import java.util.Scanner;
public class Payroll {

    public static void main(String[] args) {
        int ID;
        int hr;
        double pR;
        double w;
        
        Scanner keyboard = new Scanner(System.in);
        PayrollClass p = new PayrollClass();
        
        
        for(int i = 0; i <= 6; i++){
        System.out.println("Enter the hours worked by employee number "
                +  p.getID(i));
        hr = keyboard.nextInt();
        if(hr < 0){
            System.out.println("The number you entered is not valid, please"
                    + " enter a positive integer.");
        hr = keyboard.nextInt();
        }
        p.setHours(i, hr);
        System.out.println("Enter the hourly pay rate for employee number "
            + p.getID(i));
        pR = keyboard.nextDouble();
        if(pR < 6.00){
            System.out.println("The payRate you entered is not valid, please "
                    + "enter a payRate 6.0 or higher.");
        pR = keyboard.nextDouble();
        }
            p.setPayRate(i, pR);
            p.setWages(i);
        }
        System.out.println("\n");
        System.out.println("WAGES");
            System.out.println("-----");
            System.out.println("\n");
            System.out.println("Employee Number : " + p.getID(0));
            System.out.println("Gross Pay : " + p.getWages(0));
            System.out.println("Employee Number : " + p.getID(1));
            System.out.println("Gross Pay : " + p.getWages(1));
            System.out.println("Employee Number : " + p.getID(2));
            System.out.println("Gross Pay : " + p.getWages(2));
            System.out.println("Employee Number : " + p.getID(3));
            System.out.println("Gross Pay : " + p.getWages(3));
            System.out.println("Employee Number : " + p.getID(4));
            System.out.println("Gross Pay : " + p.getWages(4));
            System.out.println("Employee Number : " + p.getID(5));
            System.out.println("Gross Pay : " + p.getWages(5));
            System.out.println("Employee Number : " + p.getID(6));
            System.out.println("Gross Pay : " + p.getWages(6));
            
    }


}
