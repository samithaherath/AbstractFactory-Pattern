/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samit
 */
public class GalaxyB implements SmartPhone{

    int price = 20000;
    
    @Override
    public void showPrice() {
         System.out.println("GalaxyB : Rs."+price);
    }
    
}
