/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
        // TODO code application logic here
        ArrayList<Stationary> Stationary = new ArrayList<>();
        
        Scanner scan = new Scanner(new File("input1.txt"));
      while (scan.hasNext()){
          String Pens = scan.next();
          double price = scan.nextDouble();
          Stationary.add(new Stationary(Pens,price));
      }
        System.out.println("Question 8 : Balaji Sarvepalli");
        System.out.println(Stationary);
       
    }
    
}