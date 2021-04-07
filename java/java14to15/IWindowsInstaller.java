/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTF010248pannhapat;

/**
 *
 * @author kamom.kc.
 */
public interface IWindowsInstaller {
    public void formatWindows(String drive);
    public void installWindows(String version,String productKey);
    public int getLastInstalledWindowsVersion();
}
