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
public class MultiplicationTable {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("    -----TABLE----     ");
            System.out.print("Enter the number you want to print TABLE for : ");
            
            int input = Integer.parseInt(br.readLine());
           System.out.println("-------TABLE FOR " + input+ " -------");
            for(int i=1;i<=10;i++)
            {
                System.out.println(input + " X " + i + " = " + input*i );
            }
        }
    }
    
    
}
