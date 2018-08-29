/**
 * CS180 - Lab 04 - Male.java
 *
 * (Put a brief description of your program here. For example: 
 * This program represents a Male adult or child and his
 * associated information (PUID, age, and cholesterol levels).)
 *
 * @author Mike Taddeucci, <mtaddevi@purdue.edu>
 *
 * @lab l02  (Put your lab section # here)
 *
 * @9/13/13 (Put the date you completed this lab here)
 */
 
 
public class Male {
  private String puid;
  private int age;
  private int ldl;
  private int hdl;
  private int other;
 
    //Hint: Declare your instance variables here. 
    //Don't forget to comment each variable declaration as
    //specified in the CS18000 Coding Standards. 
 
    /**
     * Male Class Constructor: Creates a new instance of the Male Class;
     * initializes instance variables with the given arguments:
     *
     * @param String puid: Male's PUID #
     * @param int age: Male's age
     * @param int ldl: Male's LDL cholesterol level
     * @param int hdl: Male's HDL cholesterol level
     * @param int other: Male's Other lipids level
     */    
    public Male (String puid, int age, int ldl, int hdl, int other) {
        //write your code here to initialize your instance variables
      this.puid = puid;
      this.age = age;
      this.ldl = ldl;
      this.hdl = hdl;
      this.other = other;
      
    }
 
 
    /**
     * @return Returns an int representing the total cholesterol 
     * which is a sum of this Male's LDL, HDL, and other values. 
     */
    public int getTotalCholesterol() {
        //write code to implement this method here
      int total = 0;
      total = ldl + hdl + other;
        return total; //you will replace the 0 with your return value
    }
 
 
    /**
     * @return Returns a boolean: This method returns True
     * if the total cholesterol for this Male is less than 
     * 200 mg/dl for an adult or less than 170 mg/dl for a
     * child. 
     * 
     * Otherwise this method returns False if the TC
     * is greater than or equal to 200 mg/dl for an adult or
     * greater than or equal to 170 mg/dl for a child.
     */
    public boolean hasGoodTotalCholesterol() {
        //write code to implement this method here
      boolean gtResult = false;
      int total = getTotalCholesterol();
      if(age >= 18) {
        if(total < 200) {
          gtResult = true;
        }
        if(total >= 200) {
          gtResult = false;
        }
      }
      if(age < 18) {
        if(total < 170) {
          gtResult = true;
        }
        if(total >= 170){
          gtResult = false;
        }
        
      }
        return gtResult; //you will replace the false with your return value
    }
 
 
    /**
     * @return Returns a boolean: This method returns True if
     * the HDL level is within the healthy range; False otherwise.
     * 
     * A healthy range for HDL is greater than or equal to 
     * 40 mg/dl for both adults and children.
     */
    public boolean hasGoodHDL() {
        //write code to implement this method here
      if(hdl >= 40)
        return true; //you will replace the false with your return value
      else
        return false;
    }
 
 
    /**
     * @return Returns a boolean: This method returns True if
     * the LDL level is within the healthy range: A healthy LDL level 
     * for an adult should be less than or equal to 130 mg/dl; 
     * a healthy LDL level for a child should be 
     * less than or equal to 110 mg/dl. 
     * 
     * This method returns False if the LDL level is 
     * greater than 130 mg/dl for an adult or 
     * greater than 110 mg/dl for a child.
     */
    public boolean hasGoodLDL() {
        //write code to implement this method here
      boolean dlResult = false;
      if(age >= 18) {
        if(ldl <= 130) {
          dlResult = true;
        }
        if(ldl >130) {
         dlResult = false;
        }
      }
      if(age < 18) {
        if(ldl <= 110) {
          dlResult = true;
        }
        if(ldl > 110) {
          dlResult = false;
        }
      }
        return dlResult; //you will replace the false with your return value
    } 
}