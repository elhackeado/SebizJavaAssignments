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
public class CalculatePowerUsingRecursion {
    public static void main(String args[]) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number: ");
    int number = Integer.parseInt(br.readLine());
    System.out.print("Enter the Exponent: ");
    int exponent = Integer.parseInt(br.readLine());
    Recursion obj = new Recursion();
    System.out.println("Power of number is: " +obj.rec(number,exponent));
    }
}

class Recursion{

    public int rec(int n, int e)
    {
        int result=n;
        if(e==1)
            return result;
        if(e==0)
            return 1;
        result = rec(n,e-1)*n;
        
        return result;
    
    }
}