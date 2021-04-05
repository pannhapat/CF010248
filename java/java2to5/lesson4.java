/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Pannhapat.
 */
public class lesson4 {
    public static void main(String[] args){
        
       bark1();
       bark2();
       Lab5();
       Lab6S1();
       Lab6S2();
       Lab6S3();
       Lab6S4();
       Lab7S1();
       Lab7S2();
       Lab8();
       Lab9();
       Lab10();
       LabHa5();
        
    }
    
    static void bark1() {
        int score = 80 ;
        
        if(score < 50){
            System.out.println("fail ");
        }else if(score >= 50){
            System.out.println("normal ");
        }else if(score >= 80){
            System.out.println("good");
        }
    
         System.out.println("No condi");

    } 
    
    static void bark2() {
        int score = 80 ;
        boolean isHandSome = true;
        
        if(score < 50){
            if(isHandSome==true){
                System.out.println("Good");
            }else{
                System.out.println("fail ");
            }
        }else if(score >= 50){
            if(isHandSome==true){
                System.out.println("Good");
            }else{
                System.out.println("normal ");
            }
        }else if(score >= 80){
            System.out.println("Good");
        }
        
    } 
    
    static void Lab5() {
        
        System.out.println("--- Lab 5 ----");
        int grade = 80 ;
        switch (grade){
            case 80:
                System.out.println("--- A ----");
                break;
            case 70:
                System.out.println("--- B ----");
                break;
            case 60:
                System.out.println("--- C ----");
                break;
            case 50:
                System.out.println("--- D ----");
                break;
            case 40:
                System.out.println("--- F ----");
                break;
            default:
                System.out.println("--- E ----");
                
        }
    } 
    
    
    static void Lab6S1() {
        
        System.out.println("--- Lab 6 S1 - 4.4  1 อะไร สักชื่อ ---");
        int i = 0;
        for( i = 0;i <=10; i++ ){
            System.out.println(String.valueOf(i));
        }
    }
    
     static void Lab6S2() {
        int i = 0;
        System.out.println("--- Lab 6 S2 - 4.4  2 อะไร สักชื่อ ---");

        int sum = 0;
        for( i = 0;i <=10; i++ ){
            sum += i;
            System.out.println("%i + %i" + String.valueOf(sum)+String.valueOf(i));
        }
    }
     
    static void Lab6S3() {
        
        System.out.println("--- Lab 6 S3 - 4.4  3 อะไร สักชื่อ ---");
        int i = 0;
        int sum = 0;
        for( i = 0;i <=100; i++ ){
            if(i%12==0){
                System.out.println(String.valueOf(i));
            }
            
        }
    }
    static void Lab6S4() {
        
        System.out.println("--- Lab 6 S3 - 4.4  4 อะไร สักชื่อ ---");

           int[] myarray = {1,2,3,4,5};
           for (int counter :myarray){
               System.out.println(String.valueOf(counter));
           }
           
           
    }
    static void Lab7S1() {
         System.out.println("--- Lab 7 S2 1 อะไร สักชื่อ----");
        for( int i = 20; i >= 0 ; i-- ){
             System.out.println(String.valueOf(i));    
        }

    }
  
    static void Lab7S2() {
        
        System.out.println("กรุณา กรอกตัวเลขค่ะ ");
        int number = Integer.parseInt(System.console().readLine());
    
        do {
          System.out.println("กรุณา กรอกตัวเลขค่ะ ");
          number = Integer.parseInt(System.console().readLine());     
        }
        while (number%2 == 0);
        
    }
      
    static void Lab8() {
        
         System.out.println("--- Lab 8 a b c อะไร สักชื่อ----");
        
        for( int count = 20; count >= 0 ; count-- ){
            if(count==11){
                System.out.println(String.valueOf(count)); 
                break;
            }
        }
        
    }
     
    static void Lab9() {
        
        System.out.println("--- Lab 9 4.5 อะไร สักชื่อ----");
       int count = 20;
        for( int i = 20; i >= 0 ; i -- ){
            System.out.println("พิมพ์");
            
            for( count = i; count >= 0 ; count ++){
                if(count==11){
                    System.out.println("continue : "+String.valueOf(count));
                continue;
             }
                
            }
            
        }
        
    }
    static void Lab10() {
        
        System.out.println("--- Lab 10 4.5 อะไร สักชื่อ----");
       
        for( int i = 10; i >= 0 ; i -- ){
            if(i==2){
                continue;
            }else{
                System.out.println("พิมพ์"+String.valueOf(i));
            }
        }
        
    }
    static void LabHa5() {
        
        
        int number = 0;
         do {
           System.out.println("--- Lab อะไร สักชื่อ- 5 ---");
           System.out.println("--- พิมพ์ 1 คือ Return Method---");
           System.out.println("--- พิมพ์ 2 คือ No Return Method");
           System.out.println("--- พิมพ์ 11 หรือมากกว่า 11 คือ Exit");
          number = Integer.parseInt(System.console().readLine()); 
          if(number == 1){
              System.out.println("--- พิมพ์ ชื่อ ตัวอักษร ที่ต้องการ return --");
              String name = System.console().readLine();
              System.out.println("--เลือกทำ 1 - ReturnMethod ---" + ReturnMethod(name));
              
          }else if(number ==2){
              NoReturnMethod();
          }
          
        }
        while (number <=10);
        
    }
    public static String ReturnMethod(String inputstring) {
        return inputstring;
    }
    public static void NoReturnMethod() {
        System.out.println("--เลือกทำ  2 - NoReturnMethod ---");
    }
}
