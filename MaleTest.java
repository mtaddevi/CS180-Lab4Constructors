/**
 * CS180 - Lab 04 - MaleTest.java
 *
 * (Put a brief description of your program here. 
 * For example: A JUnit test case class to test 
 * the functionality of the Male class.)
 *
 * @author Mike Taddeucci, <mtaddevi@purdue.edu>
 *
 * @lab l02 (Put your lab section # here)
 *
 * @9/13/13 (Put the date you completed this lab here)
 */
 
import org.junit.Test;
import junit.framework.TestCase; 
 
public class MaleTest extends TestCase {
 
    //Hint: Declare some Male instance variables here to
    //be used with testing. 
    //Examples: private Male adult1, adult2, child1, child2; 
private Male adult1;
private Male child1;
private Male child2;
private Male adult2;
    /**
     * Initializes the MaleTest for use.
     */
    protected void setUp() throws Exception {
        super.setUp();
        /**
         * Hint: Initialize your Male instances here by calling the
         * constructor with arguments. Try to design Male instances
         * that could make your code fail. For example, test what
         * will happen if the Male is 18 or test when an adult has an
         * LDL of 130. 
         */
        //Example: adult1 = new Male("123", 30, 100, 40, 10); 
        adult1 = new Male("123", 30, 100, 40, 10);
        child1 = new Male("100", 17, 60, 70, 10);
        child2 = new Male("101", 16, 300, 300, 300);
        adult2 = new Male("202", 31, 10, 10, 10);
    }
 
 
    /**
     * Tests the getTotalCholesterol method.
     */
    @Test
    public void testGetTotalCholesterol() {
        // write code to test the getTotalCholesterol() method here
        //Example: assertEquals(adult1.getTotalCholesterol(), 150);
      assertEquals(adult1.getTotalCholesterol(), 150);
      assertEquals(child1.getTotalCholesterol(), 140);
      assertEquals(child2.getTotalCholesterol(), 900);
    }
 
 
    /**
     * Tests the hasGoodTotalCholesterol method.
     */
    @Test
    public void testHasGoodTotalCholesterol() {
        // write code to test the hasGoodTotalCholesterol method here
        //Example: assertTrue(adult1.hasGoodTotalCholesterol()); 
      assertTrue(adult1.hasGoodTotalCholesterol());
      assertTrue(child1.hasGoodTotalCholesterol());
      assertFalse(child2.hasGoodTotalCholesterol());
    }
 
 
    /**
     * Tests the hasGoodHDL method.
     */
    @Test
    public void testHasGoodHDL() {
        // write code to test the hasGoodHDL() method here
      assertTrue(adult1.hasGoodHDL());
      assertTrue(child1.hasGoodHDL());
      assertTrue(child2.hasGoodHDL());
      assertFalse(adult2.hasGoodHDL());
    }
 
 
    /**
     * Tests the hasGoodLDL method.
     */
    @Test
    public void testHasGoodLDL() {
        // write code to test the hasGoodLDL() method here
      assertTrue(adult1.hasGoodLDL());
      assertTrue(child1.hasGoodLDL());
      assertFalse(child2.hasGoodLDL());
    }
}