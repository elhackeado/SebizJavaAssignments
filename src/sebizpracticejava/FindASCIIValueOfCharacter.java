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
public class FindASCIIValueOfCharacter {
    
    public static void main(String args[]) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the character : ");
    String char1 = br.readLine();
    char character = char1.charAt(0);
    int asciiValue = character;
    System.out.println("ASCII value of character is: " + asciiValue);
    }
    
    
}
