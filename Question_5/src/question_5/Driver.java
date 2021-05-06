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
public class Driver {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 5: Balaji Sarvepalli");
	ComparableCircle C1 = new ComparableCircle(4);
	ComparableCircle C2 = new ComparableCircle(12);
	System.out.println("C1: ");
	System.out.println(C1);
	System.out.println("C2: ");
	System.out.println(C2);
	System.out.println((C1.compareTo(C2) == 1 ? "C1 " : "C2") + " is the larger then two Circles");
    }
    
}