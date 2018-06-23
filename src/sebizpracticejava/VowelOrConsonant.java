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
public class VowelOrConsonant {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.print("Enter the character : ");
        String val = br.readLine();
        Character cr = val.charAt(0);
        String value = cr.toString();
        if(value.equalsIgnoreCase("a") || value.equalsIgnoreCase("e") || value.equalsIgnoreCase("i") || value.equalsIgnoreCase("o") || value.equalsIgnoreCase("u") )
        //if(value.equals('a'))
        {
            System.out.println("VOWEL");
        }
        else 
        {
        System.out.println("CONSONANT");
                }
    }}
    
}
