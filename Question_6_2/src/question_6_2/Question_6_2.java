/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_6_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Question_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException 
   {
	FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception
         */
        System.out.println("Question 6 : Balaji Sarvepalli");
        fis = new FileInputStream("B:/myfile.txt"); 
	int k; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	} 

	/*The method close() closes the file input stream
	 * It throws IOException*/
	fis.close(); 	
   }
}

