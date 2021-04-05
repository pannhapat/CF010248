/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248;

import static java.lang.System.out;
/**
 * javac pannhapat/*.java
 * jar cf pannhapat.jar/*.class
 * 
 * @author kamom.kc.
 */
public class lesson2point2 {
    //  Local variable in Method 
    public static void main(String[] args){
       bark();
       changebark();
       finalbark();
    }
    
    static void bark() {
    
        System.out.println("เห่าใส่");
        String dogname = "iHello Bark";
        System.out.println("The Dog name = " + dogname);

    }
    
    static void changebark() {
        float var_float = 10.5f;
        int var_float_int = (int) var_float;
        
        int var_int = 10;
        float var_int_float = (float) var_int ;
        
        double var_double = 19.99d;
        float var_double_float = (float) var_double ;
        
        char var_char = '\u0041';
        int var_char_int = (int)var_char;
        
        System.out.println("เปลี่ยน type ");
        System.out.println("bark float to int " + String.valueOf(var_float_int));
        System.out.println("bark int to float " + String.valueOf(var_int_float));
        System.out.println("bark double to float " + String.valueOf(var_double));
        System.out.println("bark char to int " + String.valueOf(var_char_int));
    }
    
    static void finalbark() {
    
       final String dogname = " Hello ";
       System.out.println("final can't assign");
//       dogname = "World"; //can't assign 
        
    }
   
    
}
