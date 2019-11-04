/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

/**
 *
 * @author Aliya Abdullah
 */
public class Pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, num=1;
        for(i=1;i<5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num%10);
                num++;
            }
            System.out.println();
        }
    }
    
}
