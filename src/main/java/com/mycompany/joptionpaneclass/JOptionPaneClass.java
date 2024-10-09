/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneclass;
import java.util.Scanner;
//import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class JOptionPaneClass {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       //System.out.println("Enter name:");
      // String name=input.next();
      //String name= JOptionPane.showInputDialog(null,"Enter name:");
       //System.out.println(name);
    
       /*int a,b;
       String num1;
        num1 =JOptionPane.showInputDialog(null,"Input first number:");
        a=Integer.parseInt(num1);
        
        num1 =JOptionPane.showInputDialog(null,"Input first number:");
        b=Integer.parseInt(num1);
        
       //  System.out.println(" Sum=" + (a+b));
        JOptionPane.showMessageDialog(null, "The sum of " + a + " and " + b+ " is "+(a+b));*/
       
       int a, b ,results=0;
       String num1;
       int option;
       num1=JOptionPane.showInputDialog(null,"Enter the first integer:");
       a=Integer.parseInt(num1);
        
        num1=JOptionPane.showInputDialog(null,"Enter the second integer:");
       b=Integer.parseInt(num1);
       
       num1 = JOptionPane.showInputDialog(null,"===Menu===\n(1)Addition\n(2)Subtraction\n(3)Dvision\n(4)Multiplication \nEnter the number of the option:");
       
//       num1=JOptionPane.showInputDialog(null,"Enter the number of the option:");
      option=Integer.parseInt(num1);
       
      while(option !=0){
       switch(option){
           case 1:
               results= a+b;
               break;
           case 2:
               results = a- b;
               break;
           case 3:
               results= a/b;
               break;
           case 4:
                results=a*b; 
                break;
                
           default:
               JOptionPane.showMessageDialog(null,"Calculation not known");
       }
       
       JOptionPane.showMessageDialog(null,"Answers: "+ results);
      num1 = JOptionPane.showInputDialog(null,"===Menu===\n(1)Addition\n(2)Subtraction\n(3)Dvision\n(4)Multiplication \nEnter the number of the option:");
       
//       num1=JOptionPane.showInputDialog(null,"Enter the number of the option:");
      option=Integer.parseInt(num1);
       
      }
      
    }
}
