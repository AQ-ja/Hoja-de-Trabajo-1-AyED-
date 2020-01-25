/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quezada
 */
public class Radio_FATest {
    
    public Radio_FATest() {
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
     * Test of onOff method, of class Radio_FA.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        Radio_FA instance = new Radio_FAImpl();
        instance.onOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Switch method, of class Radio_FA.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.Switch();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siguiente method, of class Radio_FA.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a = 0.0F;
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anterior method, of class Radio_FA.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = 0.0F;
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radio_FA.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 0.0F;
        int b = 0;
        Radio_FA instance = new Radio_FAImpl();
        instance.guardar(e, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarFav method, of class Radio_FA.
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("seleccionarFav");
        int b = 0;
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarfrecuencia method, of class Radio_FA.
     */
    @Test
    public void testCambiarfrecuencia() {
        System.out.println("cambiarfrecuencia");
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.cambiarfrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avanzar method, of class Radio_FA.
     */
    @Test
    public void testAvanzar() {
        System.out.println("avanzar");
        float a = 0.0F;
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.avanzar(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarEmisora method, of class Radio_FA.
     */
    @Test
    public void testSeleccionarEmisora() {
        System.out.println("seleccionarEmisora");
        int b = 0;
        Radio_FA instance = new Radio_FAImpl();
        float expResult = 0.0F;
        float result = instance.seleccionarEmisora(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class Radio_FAImpl extends Radio_FA {
    }
    
}
