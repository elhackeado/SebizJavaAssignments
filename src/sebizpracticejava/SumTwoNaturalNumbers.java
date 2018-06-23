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
public class SumTwoNaturalNumbers {
    public static void main(String args[])throws Exception
    {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
        System.out.print("Enter the starting value of range for sum of natural numbers: ");
        int start = Integer.parseInt(br.readLine());
        System.out.print("Enter the ending range: ");
        int end = Integer.parseInt(br.readLine());
        if(start>end || start<1 || end<1)
        {
            System.out.println("INVALID RANGE FOR NATURAL NUMBERS");
            System.exit(0);
        
        }
        int sum=0;
        for(int i=start; i<=end; i++)
        {
            sum=sum+i;
        
        }
        System.out.println("Sum of natural numbers is: " + sum);
        
    }
    }
    
}
