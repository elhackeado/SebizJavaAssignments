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
public class NumberCanBePresentedAsSumOfTwoPrimeNumbersOrNot {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int input = Integer.parseInt(br.readLine());
        int x = 2;
        int y = input-2;
        for(int i=2; i<=(input/2); i++)
        {
            if(x+y==input && isPrime(x) && isPrime(y) )
            {
                System.out.println("Numbers are: " + x + " and " + y );
                
            }
         
                x++;
                y--;
        
        }

    }
    
    static boolean isPrime(int n)
    {
        int number =(int)Math.sqrt(n)+1;
        int c=0;
        for(int i=2;i<=number;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c>0)
            return false; 
        else
            return true;
        
}
}
    
    
