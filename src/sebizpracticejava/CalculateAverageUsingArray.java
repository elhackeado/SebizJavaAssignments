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
public class CalculateAverageUsingArray {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----AVERAGE OF NUMBERS-----");
        System.out.print("Enter the number of ENTRIES you want to make: ");
        int entries = Integer.parseInt(br.readLine());
        double ar[] = new double[entries];
        double total=0;
        for(int i=0; i<entries; i++)
        {
            System.out.print(i+1 +  " Entry: ");
            ar[i]= Double.parseDouble(br.readLine());
            total = total + ar[i];
        
        }
        System.out.println("AVERAGE OF NUMBERS IS: " + total/entries);
        
    
    
    }
    
}
