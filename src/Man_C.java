/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samit
 */
public class Man_C extends AbstractFactory{
    
    public SmartPhone getSmartphone(){
    return new SamC();
    }
    
    public DumpPhone getDumpPhone(){
    return new DamC();
    }
    
    
}
