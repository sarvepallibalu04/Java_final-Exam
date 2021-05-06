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
public abstract class Car {
    private String Brand;
    private String Cost;
    private double Color;

    public Car(String Brand, String Cost, double Color) {
        this.Brand = Brand;
        this.Cost = Cost;
        this.Color = Color;
    }

   public void BrandOfCar(){};

    public String getBrand() {
        return Brand;
    }

    public String getCost() {
        return Cost;
    }

    public double getColor() {
        return Color;
    }  
}
