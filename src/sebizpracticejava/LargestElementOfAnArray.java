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
public class LargestElementOfAnArray {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.println("-----LARGEST NUMBER OF ARRAY-----");
        System.out.print("Enter the number of entries you want to make: ");
        int entries = Integer.parseInt(br.readLine());
        double ar[] = new double[entries];
        double a = 0;
        for(int i=0; i<entries; i++)
        {
            System.out.print(i+1 + " Entry: ");
            ar[i] = Double.parseDouble(br.readLine());
            if(a<=ar[i])
                a=ar[i];
        }
        System.out.println("The largest number of the array is: " + a  );
    
    }
    
}
}