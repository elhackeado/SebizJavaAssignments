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
public class Factorial {
   public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
        System.out.println("-----FACTORIAL------");
        System.out.print("Enter the number: ");
        double input = Double.parseDouble(br.readLine());
        double fact=1;
        for(int i=1; i<=input; i++)
        {
            fact=fact*i;
        }
    
        System.out.println("Factorial of " + input + " is: " + fact);
    }
   
    
}
}