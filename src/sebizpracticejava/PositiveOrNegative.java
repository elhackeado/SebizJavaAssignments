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
public class PositiveOrNegative {
    public static void main(String args[]) throws Exception
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
      System.out.print("Enter any number: ");
      int input = Integer.parseInt(br.readLine());
      if (input==0)
          System.out.println("Zero is neither a positive nor a negative number");
      if(input<0)
          System.out.println("The number entered is a negative number.");
      if(input>0)
          System.out.println("The number entered is a positive number.");
      
    }
    
}
}