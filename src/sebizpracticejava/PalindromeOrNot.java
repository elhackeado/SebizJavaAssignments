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
public class PalindromeOrNot {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
        System.out.print("Please Enter a number/String to check whether it is PALINDROME OR NOT: ");
        String original = br.readLine();
        String temp="";
        
        for(int i=original.length()-1;i>=0;i--)
        {
            temp= temp +original.charAt(i);
            
        
        }
        if(original.equals(temp))
        {
            System.out.println(original + " is a PALINDROME");
        }
        else
        System.out.println(original + " is not a PALINDROME");
        
        }
        
    }
}
