/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Aliya Abdullah
 */
import java.util.*;
public class Factorial {

    static int fact(int n)
    {
        if(n>1)
        {
            return n*fact(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num, factorial;
        num=sc.nextInt();
        factorial=fact(num);
        System.out.println(factorial);
    }
    
}
