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



public class MobilePhone {

    String brandName;
     
    public MobilePhone() {
        System.out.println(">>>>>>>>>>>>>>>>> Start <<<<<<<<<<<<<<<<<");
        System.out.println(" << Class MobilePhone  >>");
        PhoneCall();
        SMS();
        InternetSurfing();
        System.out.println(" << Class MobilePhone  >>");
        
    }
    
    public void PhoneCall() {
         System.out.println("--- phoneCall");
    }
    public void SMS() {
         System.out.println("--- SMS");
    }
    public void InternetSurfing() {
         System.out.println("--- InternetSurfing");
    }
}

class SamSung extends MobilePhone {   
    String modelName;
    public SamSung() {
        
        brandName="SamSung";
        System.out.println("< === extends MobilePhone === > "+ brandName);
//        System.out.println("< --- extends MobilePhone--- > "+ brandName);
        GooglePlay();
        UseGearVR();
        TransformToPC();
        System.out.println("< === extends MobilePhone === > "+ brandName);
    }
    public void GooglePlay() {
         System.out.println("GooglePlay");
    }
    public void UseGearVR() {
         System.out.println("UseGearVR");
    }
    public void TransformToPC() {
         System.out.println("TransformToPC");
    }
}

class iPhone extends MobilePhone {
    String modelName;
    public iPhone() {
        brandName="Apple iPhone";
        System.out.println("< === extends MobilePhone === > "+ brandName);
        AppStore();
        System.out.println("< === extends MobilePhone === >"+ brandName);
    }    
    public void AppStore() {
         System.out.println("AppStore");
    }
}


class SamSungGalaxyS8 extends SamSung {  
    public SamSungGalaxyS8() {
        modelName = "SamSungGalaxyS8";
        System.out.println("***** extend ***** Class SamSung === > Model Name: "  + modelName);
        System.out.println(">>>>>>>>>>>>>>>>> End <<<<<<<<<<<<<<<<<");
    }
}

class SamSungGalaxyNote8 extends SamSung {  
    public SamSungGalaxyNote8() {
        modelName = "SamSungGalaxyNote8";
        System.out.println("***** extend ***** Class SamSung === >Model Name: " + modelName);
        UsePen();
        System.out.println("***** extend ***** Class iPhone === > Model Name: " + modelName);
        
        System.out.println(">>>>>>>>>>>>>>>>> End <<<<<<<<<<<<<<<<<");
    }
    public void UsePen() {
         System.out.println("***** UsePen *****");
    }   
}

class iPhone8 extends iPhone {
    
    public iPhone8() {
        modelName = "iPhone8";
        System.out.println("***** extend ***** Class iPhone === > Model Name: " + modelName);
        TouchID();
        System.out.println("***** extend ***** Class iPhone === > Model Name: " + modelName);
        
        System.out.println(">>>>>>>>>>>>>>>>> End <<<<<<<<<<<<<<<<<");
    }    
    public void TouchID() {
         System.out.println("***** TouchID *****");
    }
}

class iPhoneX extends iPhone {
    public iPhoneX() {
        modelName = "iPhoneX";
        System.out.println("***** extend ***** Class iPhone === > Model Name: " + modelName);
        FaceID();
        System.out.println("***** extend ***** Class iPhone === > Model Name: " + modelName);
        
        System.out.println(">>>>>>>>>>>>>>>>> End <<<<<<<<<<<<<<<<<");
    }       
    public void FaceID() {
         System.out.println("***** FaceID *****");
    }
}
