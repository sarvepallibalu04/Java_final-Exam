/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_8;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Stationary {
     private String Pens;
     private double price;

    public Stationary(String Pens, double price) {
        this.Pens = Pens;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stationary{" + "Pens=" + Pens + ", price=" + price + '}';
    }
    
    
}