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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle cc) {
        if (getArea() > cc.getArea())
            return 1;
        else if (getArea() < cc.getArea())
            return -1;
        else
            return 0;
    }

}
