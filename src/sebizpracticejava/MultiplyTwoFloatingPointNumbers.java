/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebizpracticejava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aman Thakur
 */
public class MultiplyTwoFloatingPointNumbers {
    
 public static void main(String args[]) throws IOException
 {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number : " );
            Float input = Float.parseFloat(br.readLine());
            System.out.print("Enter second floating point number : ");
            Float input2 = Float.parseFloat(br.readLine());
            Float product = input * input2;
            System.out.println("The product of these floating point numbers is : " + product );
            
            
 }
        
            
   

}
