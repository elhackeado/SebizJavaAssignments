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
public class CheckEvenOrOdd {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int value = Integer.parseInt(br.readLine())%2;
        if(value==0)
        System.out.println("The number is EVEN");
        else
            System.out.println("The number is odd");
        
    }
}
