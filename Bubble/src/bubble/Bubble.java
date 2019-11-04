/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

/**
 *
 * @author Aliya Abdullah
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        int arr[], n, i, j, temp;
        DataInputStream sc=new DataInputStream(System.in);
        System.out.println("Enter no of elements");
        n=Integer.parseInt(sc.readLine());
        System.out.println("Enter array");
        
        arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(sc.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The array is");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    
}
