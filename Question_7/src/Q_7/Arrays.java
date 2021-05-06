/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_7;

import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Question 07 : Balaji Sarvepalli");
        int[] array = getArray();
	System.out.print("Enter the index of the array: ");
	try {
	      System.out.println("The corresponding element value is " + 
	      array[input.nextInt()]);
		}
	        catch (ArrayIndexOutOfBoundsException ex) {
	         System.out.println("Out of Bounds.");
		}
	}
    
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}

