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

abstract class DesignThinking{
     
    
 
    public int iDesignThinking = 1;
    final int finalvar = 5;//const value
    
    
    public abstract void move();
    public abstract void eat();
    
    // const method not implement Override
    final public void learn(){ 
        System.out.println("Stand Still.."); 
    }
    public  void stand(){
        System.out.println("Stand Still.."); 
    }
}
