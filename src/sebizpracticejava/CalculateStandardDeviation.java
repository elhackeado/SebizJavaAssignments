/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebizpracticejava;
import java.io.*;

/**
 *
 * @author Aman Thakur
 */
public class CalculateStandardDeviation {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----STANDARD DEVIATION------");
        System.out.print("Enter number of entries you want to make: ");
        int entries = Integer.parseInt(br.readLine());
        double ar[] = new double[entries]; 
        double ar2[] = new double[entries];
        double total=0;
        
        for(int i=0;i<=entries-1;i++)
        {
            System.out.print(i+1 + " Entry: ");
            ar[i]=Double.parseDouble(br.readLine());
            total = ar[i]+total;
            //squaredtotal=(ar[i]*ar[i])+squaredtotal;
        
        }
        double mean = total/entries;
        double squaredmeandiff=0;
        for(int i=0;i<=entries-1;i++)
        {
            ar2[i]=(mean-ar[i])*(mean-ar[i]);
            squaredmeandiff=ar2[i]+squaredmeandiff;
        
        }
        double variance = squaredmeandiff/entries;
        double sd = Math.sqrt(variance);
        System.out.println("MEAN: " + mean);
        System.out.println("VARIANCE: " + variance);
        System.out.println("STANDARD DEVIATION: " + sd);
        
    
    }
    
}
