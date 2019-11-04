/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern3;

/**
 *
 * @author Aliya Abdullah
 */
public class Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, num=10;
        for(i=4;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num%10);
                num--;
            }
            System.out.println();
        }
    
    }
    
}
