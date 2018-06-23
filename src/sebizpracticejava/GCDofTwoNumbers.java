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
public class GCDofTwoNumbers {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----GCD/HCF OF TWO NUMBERS----");
        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(br.readLine());
        
        for(int i=2 ;i<=first*second; i++)
        {
            if(first%i==0 && second%i==0)
            {
                System.out.println("The GCD of " + first + " and " + second + " is: "+ i);
                System.exit(0);
            }
            
        }
        System.out.println("The GCD of " + first + " and " + second + " is: 1");
                
    }
}
