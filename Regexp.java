/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 *
 * @author lanek
 */
public class Regexp {
    public static void main(String[] args){
        //member variables
    boolean regexpMatch = false;
    
    String rawString = "passw0rd";
    String regExp = "\\D.*\\d";
    
   
    }
public static void regexpDigit(){
    
    String rawString = "7passw0rd";
    
    String regExp = "7passw0rd";
    
     if(rawString.matches(regExp)){
        System.out.println("Match! " + rawString + "is matched by the regexp " + regExp);
    }else{
        System.out.println("No match " + rawString + "does not match the regexp: " + regExp);
    }
    }
}
