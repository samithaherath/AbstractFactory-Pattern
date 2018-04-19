/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samit
 */
public class DamC implements DumpPhone{
    
    
    int price = 35000;
    
    @Override
    public void showPrice() {
         System.out.println("DamC : Rs."+price);
    }
    
}
