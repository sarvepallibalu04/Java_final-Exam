/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Bus {
public void act() {
        System.out.println("Bus will start");
        
    }
    }
class Transport extends Bus {
    @Override
    public void act() {
        System.out.println("Transport will start");
        
    }
}
 class Run{
     public static void main(String[] args) {
         System.out.println("Question 1-1 : Balaji Sarvepalli ");
         Bus c = new Transport();
         c.act();
         c= new Bus();
         c.act();
         
     }
     
 }