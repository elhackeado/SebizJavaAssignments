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
public class SizeOfDataTypes {
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PROGRAM TO FIND Memory Size of DATATYPES");
        System.out.println("-------------------------------------------");
        System.out.println("1. Size of Int");
        System.out.println("2. Size of Float");
        System.out.println("3. Size of Double");
        System.out.println("4. Size of Char");
        System.out.print("Please Enter the option you want to Print the size for: ");
        int option = Integer.parseInt(br.readLine());
        if(option==1)
        {
            
            
            System.out.println("Size of Int is: " + (Integer.SIZE)/8 + "bytes");
            
        }
        
        if(option==2)
        {
            
            
            System.out.println("Size of Float is: " + (Float.SIZE)/8 + "bytes");
            
        }
        if(option==3)
        {
            
            
            System.out.println("Size of Double is: " + (Double.SIZE)/8 + "bytes");
            
        }
        if(option==4)
        {
            
            
            System.out.println("Size of Char is: " + (Character.SIZE)/8 + "bytes");
            
        }
    }
    
}
