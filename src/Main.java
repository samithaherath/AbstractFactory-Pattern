
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samit
 */
public class Main {
    
    public static void main(String[] args) {
        
        AbstractFactory m1 = FactoryProducer.getFactory("c");
        m1.getSmartphone().showPrice();
        m1.getDumpPhone().showPrice();
 
    }
    
}
