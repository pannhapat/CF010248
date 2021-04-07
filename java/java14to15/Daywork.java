/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248Pannhapat2;

/**
 *
 * @author kamom.kc.
 */
public class Daywork {
    
    public static void main(String[] args) {
      
       HomeW1 hw = new HomeW1();
       hw.eat();
       hw.move();
       hw.iDesignThinking = 20;
       System.out.println(".. "+ hw.iDesignThinking );
//       hw.finalvar = 10; /error assign final 
//       System.out.println(".. "+ hw.finalvar);
        hw.statusPrice = EnumStatus.PriceStatus.NORMAL;
        hw.statusProduct = EnumStatus.ProductStatus.PUBLIC;
       
    }
}
