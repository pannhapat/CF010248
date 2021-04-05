/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248;

/**
 *
 * @author kamom.kc.
 */
public class lesson6 {
    public static void main(String[] args){
        lab6();
        lab7S1();
        lab7S2();
        lab7S3();
        lab7S4();
        lab7S5();
        lab7S6();
        lab7S7();
        lab8S1();
        lab8S2();
        
    }
    
    public static void lab6(){
        System.out.println("--- Lab 6 อะไร สักชื่อ ---");

        char [] myChar = {'1','2','3','4'};
        
        String createStr = new String(myChar);
        System.out.println(String.valueOf(createStr));
       
    }
    public static void lab7S1(){
        System.out.println("--- Lab 7 S1 - 7.1 อะไร สักชื่อ ---");
        
        String s1 = "You and Me";
        String s2 = "you and me";
        
        if(s1.equals(s2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
       
    }
    public static void lab7S2(){
        System.out.println("--- Lab 7 S2 - 7.2 อะไร สักชื่อ ---");

        
        String s1 = "ค้นหาคำ ที่มีอยู่ในประโยคนี้";
        String s2 = "ประโยค";
        
        if(s1.contains(s2)){
            System.out.println("ค้นหาคำ"+ String.valueOf(s2)+" ใน "+ String.valueOf(s2) );
            System.out.println("มีอยู่จริง");
        }else{
            System.out.println("ค้นหาคำ"+ String.valueOf(s2)+" ใน "+ String.valueOf(s2) );
            System.out.println("ไม่มีอยู่จริง");
        
        }
        
      
//s2.trim() 
//s2.toLowerCase();
//s2.toUpperCase();


        
        if(s1.equals(s2)){
            System.out.println("equals"+String.valueOf(s1));
        }else{
            System.out.println("not equals"+ String.valueOf(s2));
        }
       
    }
    public static void lab7S3(){
        System.out.println("--- Lab 7 S3 - 7.3 อะไร สักชื่อ ---");

        String s1 = "ความยาวข้อความ";
        System.out.println(String.valueOf(s1) + " = "+String.valueOf(s1.length()));
       
    }
    public static void lab7S4(){
        System.out.println("--- Lab 7 S4 - 7.4 อะไร สักชื่อ ---");

        String s1 = "abcdefghijk";
        System.out.println(String.valueOf(s1) + " = "+String.valueOf(s1.substring(4, s1.length() )));
       
    }
    public static void lab7S5(){
        System.out.println("--- Lab 7 S5 - 7.5 อะไร สักชื่อ ---");

        String s1 = " abcd efg hij k ";
        
        String s2 = s1.trim();
        
        System.out.println(String.valueOf(s1) + "ใช้ trim = "+String.valueOf(s2));
       
        String s3 = s1.replaceAll("\\s","");
        
        System.out.println(String.valueOf(s1) + "ใช้ charming replace = "+String.valueOf(s3));
       
    }
    public static void lab7S6(){
        System.out.println("--- Lab 7 S6 - 7.6 อะไร สักชื่อ ---");

        String s1 = " aBcD efG hij K ";
        
        String s2 = s1.toUpperCase();
        
        System.out.println(String.valueOf(s1) + "เดิม ใช้ Up = "+String.valueOf(s2));
       
    }
     public static void lab7S7(){
        System.out.println("--- Lab 7 S7 - 7.7 อะไร สักชื่อ ---");

        String s1 = " abcd efg hij k ";
       
        String s3 = s1.replaceAll("\\s","");
        
        System.out.println(String.valueOf(s1) + "ใช้ charming replace = "+String.valueOf(s3));
       
    }
     
    public static void lab8S1(){
     System.out.println("--- Lab 8 S1 - 8.1 อะไร สักชื่อ ---");

     int[][] array2D = {
         {1, 2, 3}, 
         {4, 5, 6, 9}, 
         {7}, 
     };
//        System.out.println(String.valueOf(array2D[0]));

     for (int i = 0; i < array2D.length; ++i) {
         for(int j = 0; j < array2D[i].length; ++j) {
             System.out.println(array2D[i][j]);
         }
     }
     
    }
    
    public static void lab8S2(){
     System.out.println("--- Lab 8 S2 - 8.2 อะไร สักชื่อ ---");

     int[][] array2D = {
         {1, 2, 3}, 
         {4, 5, 6, 9}, 
         {7}, 
     };
//        System.out.println(String.valueOf(array2D[0]));
    int sum = 0;
     for (int i = 0; i < array2D.length; ++i) {
         for(int j = 0; j < array2D[i].length; ++j) {
             System.out.println(String.valueOf("ค่า "+ array2D[i][j]));
             sum += array2D[i][j];
         }
     }
     
     System.out.println(String.valueOf("รวม "+ sum));
    }
    
   
    
    
    
}
