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
public class ConverBinaryToDecimal {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER THE BINARY NUMBER: ");
        String number = br.readLine();
        int length = number.length();
        int total=0;
        int ar[] = new int[length];
        for(int i=0;i<=length-1;i++)
        {
            ar[i]=1;
            for(int j=1;j<=length-1-i;j++)
            {
                ar[i]=ar[i]*2;
            }
            
         if(number.charAt(i)!='1' && number.charAt(i)!='0' )
         {
             System.out.println("INVAlID INPUT");
             System.exit(0);
         }
            
         if(number.charAt(i)=='1')
         {
             total = total+ar[i];
         
         }
        }
        System.out.println("DECIMAL NUMBER: " + total);
        
        
                                                                                                                                                                     
    
    }
    
}
