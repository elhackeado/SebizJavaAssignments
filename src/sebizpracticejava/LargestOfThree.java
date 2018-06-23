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
public class LargestOfThree {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first Number: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Enter the second Number: ");
        int second = Integer.parseInt(br.readLine());
        System.out.print("Enter the third Number: ");
        int third = Integer.parseInt(br.readLine());
        
        if(first>=second && first>=third)
        {
            System.out.println("Largest no. is First :" + first);
         
        }
       else if(second>first && second>third){
            System.out.println("Largest number is second : " + second);
        }
        else{
            System.out.print("Largest number is third : " + third);
        }
    
    }
    
}
