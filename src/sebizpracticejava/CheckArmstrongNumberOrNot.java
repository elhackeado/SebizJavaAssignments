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
public class CheckArmstrongNumberOrNot {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("----TO CHECK NUMBER IS ARMSTRONG NUMBER OR NOT----");
        
        System.out.print("Enter the number: ");
        String number = br.readLine().trim();
        int num = Integer.parseInt(number);
        int length = number.length();
        int ar[] = new int[length];
        int total = 0;
        
        for(int i=0; i<=length-1;i++)
        {
            ar[i]=Integer.parseInt(String.valueOf(number.charAt(i)));
            int a = ar[i];
           
            for(int j=1;j<=length-1;j++)
            {
                ar[i]=ar[i]*a;
                
            }
           
            total = total+ar[i];
        }
        
        if(num==total)
        {
            System.out.println(num +" is an Armstrong Number");
        
        }
        else
            System.out.println(num + " is not an Armstrong number");
        
            
    
    
    }
}
}