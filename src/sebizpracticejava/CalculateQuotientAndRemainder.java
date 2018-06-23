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
public class CalculateQuotientAndRemainder {
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Dividend: ");
        int dividend = Integer.parseInt(br.readLine());
        System.out.print("Enter Divisor: ");
        int divisor = Integer.parseInt(br.readLine());
        int quotient = dividend/divisor;
        System.out.println("Quotient: " + quotient );
        System.out.println("Remainder: " + dividend%divisor);
        
    }
    
}
