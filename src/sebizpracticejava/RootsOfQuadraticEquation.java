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
public class RootsOfQuadraticEquation {
    public static void main(String args[]) throws Exception
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("----ROOTS OF QUADRATIC EQUATION----");
     System.out.print("Enter the coefficient of X2: ");
     int a = Integer.parseInt(br.readLine());
     System.out.print("Enter the coefficient of X: ");
     int b = Integer.parseInt(br.readLine());
     System.out.print("Enter the constant: ");
     int c = Integer.parseInt(br.readLine());
     
     double discriminant = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
     double negdis = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
     
     System.out.println("Roots of equation are: " + discriminant + " and " + negdis);
     
     }
}
