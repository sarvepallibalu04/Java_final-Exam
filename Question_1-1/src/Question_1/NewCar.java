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

public class NewCar extends Car {

    public NewCar(String Brand, String Cost, double Color) {
        super(Brand, Cost, Color);
    }
    @Override
    public void BrandOfCar()
    {
        System.out.println("The new Car Brand is Audi");
    } 
    public void Cost() { 
        System.out.print("Cost of the Car is : ");
        System.out.println(super.getBrand());
    }
    public void Color(){
        System.out.print("Color of the Car is : ");
        System.out.println(super.getCost());  
    }  
  
    }

