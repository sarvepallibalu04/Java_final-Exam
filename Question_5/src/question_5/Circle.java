/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_5;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Circle {
    private double radius;

	public Circle() {
	}

	public Circle(double radius) {
            this.radius = radius;
	}

	public double getRadius() {
            return radius;
	}

	public void setRadius(double radius) {
            this.radius = radius;
	}

	public double getArea() {
            return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
            return  "Radius: " + radius+"\nArea of Circle : "+this.getArea();
	}
}
