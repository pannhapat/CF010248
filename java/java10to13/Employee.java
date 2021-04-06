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
public class Employee {
    public String firstname;
    public String lastname;
    private int salary;
    public String position;
    
    
    public Employee(){
        this.firstname = "Anonymous";
        this.lastname = "Anonymous";
        this.salary =9000;
        this.position ="position";
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = 9000;
        this.position = "position";
    }
//     Overloading
    public Employee(String firstname, String lastname, int salary, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.position = position;
    }
    
    public void hello(){
        System.out.println("Hello"+this.firstname);
    }
    
    public int getSalary(){
        return salary;
    }
    
    //13.2  
    public void checkPosition(){
        System.out.println("My Position is "+this.position);
    }
}
