/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Question_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, NoSuchElementException {
        System.out.println("Question 8 : Balaji Sarvepalli");
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            String name = sc.nextLine();
            System.out.print("name of the person :");
            System.out.println(name.length());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

}