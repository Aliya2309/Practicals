/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digit;

import java.util.Scanner;

/**
 *
 * @author Aliya Abdullah
 */
public class Digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num, sum=0, rev=0, rem;
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            rev=rev*10+rem;
            num=num/10;
            
        }
        System.out.println("rev= "+rev+"\nsum="+sum);
        
    }
    
}
