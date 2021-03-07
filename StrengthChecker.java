/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

import static java.util.stream.DoubleStream.builder;

/**
 *
 * @author lanek
 */
public class StrengthChecker {
    //member variables
    private final int MAX_DEFAULT = 15;
    private int maxLength = 15;
    private final int MIN_DEFAULT = 8;
    private int minLength = 8;
    
    
    private final String SPEC_CHAR_REGXP = ".*[*&%$#]";
    
    
    
    //APPLIES STRENGTH RULES
    //return null if password passes all checks not null with tips for fixing it
    public  boolean verifyCandidatePass(String pswd ){
       return checkSpecialChar(pswd) && checkUpperCase(pswd) && checkLowerCase(pswd) && checkForSpaces(pswd) && checkLength(pswd);
       
        
    }
    
    //check pswd to see if it contains a special char most likely through if
    //tried to do index of to find if the password contained a special character didnt work out too well took me a while to even get this 
    private boolean checkSpecialChar (String pswd){
           String regxp = SPEC_CHAR_REGXP;
           //clarifying that our special character member variable is going to be our regxp for our if statement 
           
           if(pswd.matches(regxp)){
               return true;
           }else{
               System.out.println("The special character requirement hasn't been met.");
               return false;
           }
    }
    private boolean checkUpperCase(String pswd){
          String regxp = ".*\\p[UPPER].*";
           //clarifying that our special character member variable is going to be our regxp for our if statement 
           
           if(pswd.matches(regxp)){
               return true;
           }else{
               System.out.println("The uppercase character requirement hasn't been met.");
               return false;
           }
    }
    private boolean checkLowerCase(String pswd){
         String regxp = ".*\\p[lower].*";
           //clarifying that our special character member variable is going to be our regxp for our if statement 
           
           if(pswd.matches(regxp)){
               return true;
           }else{
               System.out.println("The lowercase character requirement hasn't been met.");
               return false;
           }
    }
    private boolean checkForSpaces(String pswd){
          String regxp = ".*\\.*";
           //clarifying that our special character member variable is going to be our regxp for our if statement 
           
           if(pswd.matches(regxp)){
               return true;
           }else{
               System.out.println("There can be no space characters within your password!!");
               return false;
           }
    }
    
    //null if length requirements are met 
    //checks to see if our password we have chosen is up to the standards 
    private String checkLength(String pswd){
        StringBuilder builder = null;
        int lgth = pswd.length();
        if(lgth < minLength){
            builder = new StringBuilder();
            builder.append("Password does not meet minimum length requirement");
        } else if (lgth > maxLength){
            builder = new StringBuilder();
            builder.append("Password is too long");
            
        }
        if(builder == null){
            return null;
        }else{
        return builder.toString();  
        }
    }
    // creates our min and max lengths for the password
    public void setMinMaxLength(int min, int max){
        if(min < 1){
            minLength = MIN_DEFAULT;
        } else {
            minLength = min;
        }
        if(max < min){
            maxLength = MAX_DEFAULT;
        } else {
            maxLength = max;
        }
    }
    
    
   
}
