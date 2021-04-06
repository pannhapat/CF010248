/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248pannhapat;

/**
 *
 * @author PANNHAPAT..
 */
public class CEO extends Employee{

    public CEO(String firstnameInput, String lastnameInput, int salaryInput, String positionInput){
        super(firstnameInput,lastnameInput,salaryInput,positionInput);
        
    }
    
    public void orderWebsite(IWebsiteCreate create){
        create.createWebsite("template", "Code");
    }

    
  
   
}
