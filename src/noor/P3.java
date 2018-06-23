/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noor;

/**
 *
 * @author Aman Thakur
 */
public class P3 {
    public static void main(String args[])
    {
        for(int i=0;i<9;i++)
        { 
           if(i<=4) 
           {for (int j=4;j>=i;j--)
        {  System.out.print(" ");}
         for (int k=0;k<=i;k++)
         { System.out.print(" *"); }
         System.out.println("");
         
        
            
        }
           else
           {
              for (int k=4;k<=i;k++)
         { System.out.print(" "); }
              for (int j=8;j>=i;j--)
        {  System.out.print(" *");}

         System.out.println("");
               
               
           }}
    }
}
