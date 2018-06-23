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
public class BubbleSort {
     public static void main(String args[])
    {int arr[]=new int[5];
    arr[0]=54;
    arr[1]=546;
    arr[2]=45;
    arr[3]=525;
    arr[4]=12;    
    int temp;
    for (int i=0;i<=4;i++)
    {if(arr[i]>arr[i+1])
    {temp=arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;
    } for(int k=0;k<=4;k++)
        System.out.println(arr[k]);
        
    }
}
}