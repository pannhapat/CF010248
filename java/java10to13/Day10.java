/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package CTF010248pannhapat;


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
        
        //13.2    
        dang.checkPosition();
        
    }

}
