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
public class LCMofTwoNumbers {
    public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("------LCM OF TWO NUMBERS--------");
    System.out.print("Enter the first number: ");
    int first = Integer.parseInt(br.readLine());
    System.out.print("Enter the second number: ");
    int second = Integer.parseInt(br.readLine());
    
    int number=0;
    if(first>second)
        number=first;
    else
        number=second;
        

    for(int i=number;i<=first*second;i++)
    {
        if(i%first==0 && i%second==0)
        {
            System.out.println("The LCM of "+ first + " and " + second +" is " + i);
            break;
        
        }
        
    
    } 

    
}
}