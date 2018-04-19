/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samit
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("A")) {
            return new Man_A();
        } else if (choice.equalsIgnoreCase("B")) {
            return new Man_B();
        }else if(choice.equalsIgnoreCase("C")){
        return new Man_C();
        }   
        return null;

    }

}
