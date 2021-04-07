/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package CTF010248pannhapat;

import java.util.ArrayList;


/**
 *
 * @author PANNHAPAT.
 */

public class Day10 {
    
    
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++){
            employees[i] = new Employee("name"+i,"lastname"+i,10000,"Position");
        }
        System.out.println(String.valueOf(employees[0].firstname));
        System.out.println(String.valueOf(employees[1].firstname));
        System.out.println(String.valueOf(employees[2].firstname));
        
        //12.1    Instance Class ใน Method Main
        Employee dang = new Employee("Dang","Red",10000,"Position A");
        CEO ceo = new CEO("Captain","Marvel",30000,"Position B");
        
        CEO ceo2 = (CEO)ceo;
        
        //13.2    
        dang.checkPosition();
        
//        14.1 14.2 14.3
        Programmer prog = new Programmer("Captain", "Marvel", 20000,"Position P");
        prog.checkPosition();
        
        ArrayList <Employee> myList = new ArrayList<>();
        myList.add(ceo2);
        myList.add(dang);
        myList.add(prog);
        CEO ceo3 = (CEO) myList.get(0);
        Employee dang2= myList.get(1);
        Programmer prog2 = (Programmer)myList.get(2);
        ceo3.hello();
        prog2.hello();
        
//        ***
        IWebsiteCreate dangc = new Programmer("Dang", "Red", 10000, "Position Z");
        Programmer dangc2 = (Programmer)dang;
        AI alphaGo = new AI("alphago","java");
        IWebsiteCreate alphaGo2 = alphaGo;
        
        ceo.orderWebsite(dangc);
        ceo.orderWebsite(dangc2);
        ceo.orderWebsite(alphaGo);
        ceo.orderWebsite(alphaGo2);
       
      
       
    }
    
}








