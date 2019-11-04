/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author Aliya Abdullah
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num, sum=0, rem, temp;
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            sum+=rem*rem*rem;
            num=num/10;
            
        }
        if(sum==temp)
        System.out.println("armstrong");
        else
            System.out.println("Not armstong");
    }
    
}
