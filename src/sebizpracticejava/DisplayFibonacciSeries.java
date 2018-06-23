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
public class DisplayFibonacciSeries {
    public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
        System.out.println("------FIBONACCI SERIES-------");
        System.out.print("Please enter the first value: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Enter second Number: ");
        int second = Integer.parseInt(br.readLine());
       int sum=0;
        for(int i=2; i<10;i++)
        {
            sum = first+second;
            System.out.println(sum);
            first=second;
            second=sum;
            
        
        }
    
    
    }
    
    }
}
