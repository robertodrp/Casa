/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import ico.casa.componentes.Sala;


public class Casa {

    public static void main(String[] args) {
        
        Casa casa1 = new Casa();
        casa1.setSala(new Sala());
        System.out.println(casa1);
        
        
        
        // TODO code application logic here
    } 

    private void setSala(Sala sala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
