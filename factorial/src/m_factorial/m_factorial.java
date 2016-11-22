/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m_factorial;

/**
 *
 * @author usuario
 */
public class m_factorial {
    
    public int lim;

    public m_factorial(int lim) {
        this.lim = lim;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }
    
    public void fac() {

        int facto = 1;

        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <= i; j++) {

                facto = facto * j;

            }
            
            System.out.println("factorial de: " +i+" =  "+ facto);
            
            facto = 1;

        }


    }
    
}
