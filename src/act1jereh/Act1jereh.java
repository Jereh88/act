/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1jereh;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Act1jereh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Last Name: ");
        String lName = scn.nextLine();
        
        System.out.print("Enter First Name: ");
        String fName = scn.nextLine();
        
        System.out.print("Enter Middle Initial: ");
        String mInitial = scn.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scn.nextInt();
        
        scn.nextLine();
        
        System.out.print("Enter Gender: ");
        String gender = scn.nextLine();

        System.out.print("Enter Birth Month: ");
        String birthMonth = scn.nextLine();

        System.out.print("Enter Birth Day: ");
        int birthDay = scn.nextInt();
        
        System.out.print("Enter Birth Year: ");
        int birthYear = scn.nextInt();
        
        System.out.println("Your data:\nLast Name: " + lName + "\nFirst Name: " + fName + "\nMiddle Initial: " + mInitial + "\nAge: " + age
        + "\nGender: " + gender + "\nBirthdate: " + birthMonth + "/" + birthDay + "/" + birthYear);
        
        scn.close();
    
    
    }
    
}
