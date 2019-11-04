/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomp;

/**
 *
 * @author Aliya Abdullah
 */
public class Stringcomp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str1="Aliya";
        String str2="Abdullah";
        String str3="Aliya";
        if(str1.equals(str3))
            System.out.println(str1+str2);
        else
            System.out.println("Not equal");
    }
    
}
