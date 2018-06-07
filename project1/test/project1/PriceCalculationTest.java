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
 * @author AKSHATA
 */
public class PriceCalculationTest {
    
    public PriceCalculationTest() {
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
     * Test of priceCalculation method, of class PriceCalculation.
     */
    @Test
    public void testPriceCalculation() {
        System.out.println("priceCalculation");
        int screen = 1;
        int theaterRating = 5;
        int ticket = 1;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 400;
        double result = instance.priceCalculation(screen, theaterRating, ticket);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
