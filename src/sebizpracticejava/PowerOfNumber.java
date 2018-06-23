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
public class PowerOfNumber {
    public static void main(String args[]) throws Exception
    {
        System.out.println("------CALCULATE THE POWER OF NUMBER------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.print("Enter the number: ");
            int number = Integer.parseInt(br.readLine());
            System.out.print("Enter the exponent: ");
            int exponent = Integer.parseInt(br.readLine());
            int answer=1;
            for(int i=1;i<=exponent;i++)
            {
               answer= answer*number;
            
            }
            System.out.println("POWER OF NUMBER IS: " + answer);
            
        }
    
    
    }
    
}
