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

public class Programmer extends Employee implements IWebsiteCreate, IWindowsInstaller
{

    public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput){
        super(firstnameInput,lastnameInput,salaryInput,positionInput);
    }
    
    public void FixPC(String serialNumber){
        System.out.println("I'm trying to fix PC serialNumber: "+serialNumber);
    }

    @Override
    public int getSalary() {
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }

     
    @Override
    public void createWebsite(String template, String titleName){
        System.out.println("Setup Template: ");
        System.out.println("Set Title name: ");
    }

    @Override
    public void formatWindows(String drive) {
        System.out.println("drive "+drive);
    }
    
    @Override
    public void installWindows(String version, String productKey) {
        System.out.println("version "+version);
        System.out.println("productKey "+productKey);
    }

   
    @Override
    public int getLastInstalledWindowsVersion() {
        System.out.println("getLastInstalledWindowsVersion");
        return 0;
    }

   
    
}
