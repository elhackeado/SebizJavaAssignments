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
public class ReverseASentenceUsingRecursion {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the sentence: ");
        String sentence = br.readLine().trim();
        int length = sentence.length();
        new Recurs().rec(sentence,length);
    }
    
}

class Recurs{
    int i=0; 
    String rec(String sen, int length){
            if(i==length)
                return "";
        
            rec(sen,i+1);
                System.out.print(sen.charAt(i));
                return "";
          
    }


}
