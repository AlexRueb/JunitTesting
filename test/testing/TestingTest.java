/*
 * Author: Alex Rueb
 * Date: 4/13/18
 * Overview: Lab 7, practicing with test driven development
 *
*/
package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import testing.Testing;

/**
 *
 * @author alex
 */
public class TestingTest {

    public TestingTest() {
    }
    
    
    //Tests a case of only quarters
    @Test 
    public void testOnlyQuarters() {
        int[] exp = {25,25,25,0,0,0,0,0,0,0};
        int[] given = {25,10,5,1};
        int[] result = Testing.makeChange(given, 75);
        assertArrayEquals(exp, result);
    }

    
    //Tests with the 50 cent piece added in
    @Test
    public void testFiftyCentPiece() {
        int[] exp = {50,25,10,5,1,0,0,0,0,0};
        int[] given = {50,25,10,5,1};
        int[] result = Testing.makeChange(given, 91);
        assertArrayEquals(exp, result);
    }

    
    //Tests to make sure an empty array is handled
    @Test (expected = IllegalArgumentException.class)
    public void testGetMinEmptyArray() {
        int[] array = {};
        int coinVal = 42;
        Testing.makeChange(array, coinVal);
        //assertTrue("Array can't be empty", array.length != 0);
    }

    
    
    //The basic test to make sure it works with standard change
    @Test
    public void testMakeChange() {
        System.out.println("makeChange");
        int[] exp = {25, 10, 5, 1, 1, 0, 0, 0, 0, 0};
        int[] given = {25, 10, 5, 1};
        int[] result = Testing.makeChange(given, 42);
        assertArrayEquals(exp, result);
        // TODO review the generated test code and remove the default call to fail.
    }


}
