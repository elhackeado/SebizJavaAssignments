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
public class CharacterOrNot {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.print("Enter the character : ");
        String input =  br.readLine();
        if(input.length()==1)
        {
           char cr = input.charAt(0);
        int ascii = cr;
        if (ascii>64 && ascii<91 || ascii>96 && ascii<123)
            System.out.println("Alphabet");
        else
        {
            System.out.println("Not an Alphabet");
        }
        }
        
        else
        {
            System.out.println("Not an Alphabet");
        }
        
        
        
    
    }
    
}
}