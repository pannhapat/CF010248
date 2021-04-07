/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248pannhapat;

import CTF010248pannhapat.IWebsiteCreate;
/**
 *
 * @author kamom.kc.
 */
public class AI implements IWebsiteCreate{
    public String name;
    public String language;
    public AI(String nameInput, String languageInput)
    {
        this.name=nameInput;
        this.language=languageInput;
        
    }

    @Override
    public void createWebsite(String template, String titleName) {
        System.out.println(language+" automated setup template "+ template);
        System.out.println(language+" automated set title "+ titleName);
    }
    
}
