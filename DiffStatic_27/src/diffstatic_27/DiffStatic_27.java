/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diffstatic_27;

/**
 *
 * @author Aliya Abdullah
 */

class Test
{
    
    static int x=8;
    static
    {
        System.out.println("static block in class test");
    }
    static void display()
    {
        System.out.println("Static method");
        System.out.println("x in method =  "+x);
    }
}
public class DiffStatic_27 
{
    
    public static void main(String[] args) 
    {
        System.out.println("x= "+Test.x);
        Test.display();
    }
    
}
