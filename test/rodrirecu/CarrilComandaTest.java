/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rodrirecu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CarrilComandaTest {
    
    public CarrilComandaTest() {
    }

    /**
     * Test of añadirComanda method, of class CarrilComanda.
     */
    @Test
    public void testAñadirComanda() {
     CarrilComanda s = new CarrilComanda(1);
        s.anadirComanda();
        s.anadirComanda();
        s.anadirComanda();
        s.anadirComanda();
        assertEquals(5, s.ncomandas);
    }
    
}
