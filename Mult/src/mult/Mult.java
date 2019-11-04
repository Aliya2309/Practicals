/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mult;

import java.util.Scanner;

/**
 *
 * @author Aliya Abdullah
 */
public class Mult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m1[][], m2[][], ans[][], j, i, r1, c1, r2, c2, k;
        System.out.println("enter r and c");
        r1=sc.nextInt();
        c1=sc.nextInt();
        r2=sc.nextInt();
        c2=sc.nextInt();
        m1=new int[r1][c1];
        m2=new int [r2][c2];
        ans=new int[r1][c2];
        System.out.println("Enter array 1");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter array 2");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                ans[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    ans[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        System.out.println("ans");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    
}
