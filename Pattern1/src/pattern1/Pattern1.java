/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern1;

/**
 *
 * @author Aliya Abdullah
 */
public class Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c='A';
        int i, j;
        for(i=1;i<5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    
}
