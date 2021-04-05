/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248;

/**
 *
 * @author Pannhapat.
 */
public class lesson3 {
    
    public static void main(String[] args){
    
        bark1();
        bark2();
        bark3();
       
    }
    static void bark1() {
//       i++  5
        System.out.println("--3 1 ----");
        int i = 20;
        
        System.out.println("1-- ++ i ----"+ String.valueOf(++i));
        System.out.println("2-- ++ i ----"+ String.valueOf(++i));
        System.out.println("3-- ++ i ----"+ String.valueOf(++i));
        System.out.println("4-- ++ i ----"+ String.valueOf(++i));
        System.out.println("5-- ++ i ----"+ String.valueOf(++i));
        
        System.out.println("1-- --i ----"+ String.valueOf(++i));
        System.out.println("2-- --i ----"+ String.valueOf(++i));
        System.out.println("3-- --i ----"+ String.valueOf(++i));
        System.out.println("4-- --i ----"+ String.valueOf(++i));
        System.out.println("5-- --i ----"+ String.valueOf(++i));
        

    } 
    static void bark2() {
 
         System.out.println("--3 2 ----");
        float var_float1 = 10.5f;
        float var_float2 = 10.5f;

//            if( var_float1 && var_float2){
//                  
//            }

         System.out.println("var_float1 && var_float2 bad operand ");

    } 
    

    
    static void bark3() {
         System.out.println("--3 3 ----");
         
        char var_char1 = '\u0041';
        char var_char2 = '\u0042';

//        if( var_char1 || var_char2){
//              
//        }

         System.out.println("var_char1 || var_char2 bad operation type ");

        }    
}

