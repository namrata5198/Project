/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NAMRATA
 */
public class TheaterTest {
    
    public TheaterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rating method, of class Theater.
     */
    @Test
    public void testRating() {
        System.out.println("rating");
        int theaterId = 101;
        Theater instance = new Theater();
        int expResult = 5;
        int result = instance.rating(theaterId);
        assertEquals(expResult, result);
        
        int theaterId1 = 102;
        int expResult1 = 4;
        int result1 = instance.rating(theaterId1);
        assertEquals(expResult1, result1);
        
        int theaterId2 = 103;
        int expResult2 = 3;
        int result2 = instance.rating(theaterId2);
        assertEquals(expResult2, result2);
        
        int theaterId3 = 789;
        int expResult3 = 0;
        int result3 = instance.rating(theaterId3);
        assertEquals(expResult3, result3);
    }
    
}
