/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samestatic;

/**
 *
 * @author Aliya Abdullah
 */
public class SameStatic 
{
    static int x=5;
    static
    {
        System.out.println("Static block");
    }
    static void display()
    {
        System.out.println("Static method. x=  "+x);
    }
    public static void main(String[] args) 
    {
        display();

    }
    
}
