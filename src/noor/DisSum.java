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
public class DisSum {    public static void main(String args[])
    {int arr[]=new int[5];
    int sum=0;
    arr[0]=54;   
    arr[2]=45;
    arr[3]=525;
    arr[4]=12;
    arr[1]=546;
    for(int i=4;i>=0;i--)
    { sum=sum+arr[i];
        
    }
    System.out.println(sum);
}}
