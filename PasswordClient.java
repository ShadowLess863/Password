/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

import java.util.Scanner;

/**
 *
 * @author lanek
 */
public class PasswordClient {
    public static void main(String[] args){
        //start of password creator
        Scanner scan =  new Scanner(System.in);
        StrengthChecker checker = new StrengthChecker();
        
        System.out.println("Hello!!!, choose a password.");
        String pswd = scan.nextLine();
        
         if(checker.verifyCandidatePass(pswd )) {
            System.out.println("This is a great Password!!!!");
        }
         else  {
            int check = 1;
            while (check ==1) {
                System.out.println("Does your password have 10 characters in it?");
                System.out.println("Does your password have any sort of spacing in it?");
                System.out.println("Does your password have 4 uppercase letters?");
                System.out.println("Does your password have 4 lowercase letters?");
                System.out.println("Does your password have 2 digits?");
                System.out.println();
                System.out.println("Please Try Again: ");
                pswd = scan.nextLine();
                if(checker.verifyCandidatePass(pswd )) {
                    check = 0;
                    System.out.println("This Password is Good to Go!");
                }
            } // close while
        } // close if/else
        
       
      
       
    }
        
}
