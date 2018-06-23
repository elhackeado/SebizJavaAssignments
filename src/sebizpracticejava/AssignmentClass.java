/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sebizpracticejava;
import java.util.*;

/**
 *
 * @author Aman Thakur
 */
public class AssignmentClass {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum = 0, count = 0;
    while (sc.hasNextInt()){
    int num = sc.nextInt();
    sum+=num;
    count++;
   
    }
    int mean = sum/count;
    System.out.println("mean : " + mean);
    }
    
}
