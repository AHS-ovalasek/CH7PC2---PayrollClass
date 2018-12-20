/**
 * Owen Valasek
 * 12/19/18
 * CH7PC2 - Payroll Class
 */
import java.util.Scanner;
public class PayrollClass {
    //create fields
    int employeeID;
    int hours;
    double payRate;
    double wages;
    
    Scanner keyboard = new Scanner(System.in);
    
    //create the arrays
    //initialize ID array
    int[] ID = {5658845, 4520125, 7895122, 8777541, 1302850, 7580489, 8451277};
    int[] hr = new int[7];
    double[] hPR = new double[7];
    double[] wG = new double[7];
    
    //create setHours method and set hours equal to the hours array at i.
    public void setHours(int i, int h){
        hr[i] = h;
            
        }   
    //create setPayRate method and set payRate equal to the payRate array at i.
    public void setPayRate(int i, double pR){
        hPR[i] = pR;
        }
    //create setWages method and set the wages array equal to the 
    //hours array at i * the payRate array at i.
    public void setWages(int i){
        
         wG[i] = hr[i] * hPR[i]; 

        }
    //create setID method and set employeeID equal to the ID array at i.
    public void setID(int i){
        ID[i] = i;
    }
    //returned array hours at i.
    public int getHours(int i){
        return hr[i];
    }
    //returned array payRate at i.
    public double getPayRate(int i){
        return hPR[i];
    }
    //returned array wages at i.
    public double getWages(int i){
       
        return wG[i];
    }
    //returned array wages at i.
    public int getID(int i){
        return ID[i];
    }
}

