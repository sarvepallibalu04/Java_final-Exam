/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Throws {

    /**
     * @param args the command line arguments
     */
   public static void findFile() throws IOException {
    // code that may produce IOException
    File newFile=new File("input.txt");
    FileInputStream stream=new FileInputStream(newFile);
  }

   public static void main(String[] args) {
    try{
      findFile();
    } catch(IOException e){
      System.out.println("Question 9 : Balaji Sarvepalli");
      System.out.println(e);
    }
  }
}