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
public class SwapTwoNumbers {
    public static void main(String args[]) throws Exception
    {
        int temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first Number: ");
        int firstNo = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int secondNo = Integer.parseInt(br.readLine());
        temp = firstNo;
        firstNo = secondNo;
        secondNo = temp;
        System.out.println("values after swapping FIRST NUMBER = " + firstNo + "  SECOND NUMBER = " + secondNo );
        
        
    }
    
}
