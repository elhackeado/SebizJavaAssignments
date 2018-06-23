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
public class DecimalToBinary {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.println("----DECIMAL TO BINARY-----");
        System.out.print("Enter the decimal number: ");
        int number = Integer.parseInt(br.readLine());
        int remainder=0;
        StringBuffer str = new StringBuffer("");
        
        for(int i=0; number>=1;i++)
        {
            str.append(number%2);
            number = number/2;
        }
        
        for(int i=str.length()-1;i>=0;i--)
        {  System.out.print(str.charAt(i)); }
        System.out.println();
        
        
    
    }
}
}