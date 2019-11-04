/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycpy;

/**
 *
 * @author Aliya Abdullah
 */
public class Arraycpy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int str1[]={1,2,3,4,5,6,7,8,9};
        int str2[]={99,98,97,96,95,94,93};
        System.arraycopy(str1, 0, str2, 3, 4);
        for(int i=0;i<str2.length;i++)
        System.out.println(str2[i]);
    }
    
}
