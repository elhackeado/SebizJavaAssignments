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
public class FindingLeapyear {
    public static void main(String args[]) throws Exception
    {   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(br.readLine());
        if(year%4==0 && year%100==0 && year%400==0)
        {
              System.out.println("LEAP YEAR");
        }
        else if(year%4==0 && year%100!=0 && year%400!=0)
        {
            System.out.println("LEAP YEAR");
        }
        
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }
        }
           
    
}
}
