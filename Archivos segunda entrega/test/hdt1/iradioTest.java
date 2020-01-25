/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt1;

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
public class iradioTest {
    
    public iradioTest() {
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
     * Test of onOff method, of class iradio.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        iradio instance = new iradioImpl();
        instance.onOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarfrecuencia method, of class iradio.
     */
    @Test
    public void testCambiarfrecuencia() {
        System.out.println("cambiarfrecuencia");
        iradio instance = new iradioImpl();
        float expResult = 0.0F;
        float result = instance.cambiarfrecuencia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avanzar method, of class iradio.
     */
    @Test
    public void testAvanzar() {
        System.out.println("avanzar");
        float a = 0.0F;
        iradio instance = new iradioImpl();
        float expResult = 0.0F;
        float result = instance.avanzar(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class iradio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 0.0F;
        int b = 0;
        iradio instance = new iradioImpl();
        instance.guardar(e, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarEmisora method, of class iradio.
     */
    @Test
    public void testSeleccionarEmisora() {
        System.out.println("seleccionarEmisora");
        int b = 0;
        iradio instance = new iradioImpl();
        float expResult = 0.0F;
        float result = instance.seleccionarEmisora(b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iradioImpl implements iradio {

        public void onOff() {
        }

        public float cambiarfrecuencia() {
            return 0.0F;
        }

        public float avanzar(float a) {
            return 0.0F;
        }

        public void guardar(float e, int b) {
        }

        public float seleccionarEmisora(int b) {
            return 0.0F;
        }
    }
    
}
