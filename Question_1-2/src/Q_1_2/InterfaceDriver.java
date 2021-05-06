/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_1_2;

/**
 *
 * @author Balaji Sarvepalli
 */
public class InterfaceDriver implements InterfaceA, InterfaceB {
@Override
public String getName() {
//Must provide its own implementation
return InterfaceA.super.getName() + InterfaceB.super.getName();
}
public static void main(String[] args) {
InterfaceDriver  c = new InterfaceDriver ();
System.out.println("Question 1-2 : Balaji Sarvepalli");
System.out.println( c.getName() ); // Prints "ab"
System.out.println( ((InterfaceA)c).getName() ); // Prints "ab"
System.out.println( ((InterfaceB)c).getName() ); // Prints "ab"
}
}
