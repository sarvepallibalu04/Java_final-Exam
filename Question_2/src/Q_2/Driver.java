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
public class Driver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        System.out.println("Question 2: Balaji Sarvepalli");
        GeometricObject[] object = new GeometricObject[5];
        object[0] = new Square(6);
        object[1] = new Square(7);
        object[2] = new Square(8);
        object[3] = new Square(9);
        object[4] = new Square(10);
        for (GeometricObject obj : object) {
            if (obj instanceof Colorable) {
                System.out.println(obj);
                ((Colorable) obj).howToColor();
            }
        }
    }
}
    
