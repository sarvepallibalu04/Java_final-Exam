/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_2;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Square  extends GeometricObject implements Colorable {

    private double length;
    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Length=" + length    + "  Area of a square=" + getArea();
    }

}
