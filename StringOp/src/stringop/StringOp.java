/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringop;

import java.util.StringTokenizer;

/**
 *
 * @author Aliya Abdullah
 */
public class StringOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str="Rizvi college of Engineering";
        String arr[]=new String[50];
        int c=0, i, j;
        StringTokenizer token=new StringTokenizer(str, " ");
        while(token.hasMoreTokens())
        {
            arr[c]=token.nextToken();
            c++;
        }
        for(i=0;i<c;i++)
        {
            for(j=i+1;j<c;j++)
            {
                if(arr[j].compareToIgnoreCase(arr[i])  <  0)
                {
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("Alphabetical order is");
        for(i=0;i<c;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
