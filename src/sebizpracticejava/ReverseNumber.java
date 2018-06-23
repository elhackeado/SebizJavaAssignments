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
public class ReverseNumber {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        
            System.out.print("Please Enter a number you want to reverse: ");
            String input = br.readLine();
            for(int i=input.length()-1; i>=0;i--)
            {
                System.out.print(input.charAt(i));
            }
        
        
        
    }
    
}
