/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ramiro
 */
public class TransponerTest {
    
    public TransponerTest() {
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
     * Test que controla que la transpuesta de una matriz sea igual a la salida esperada.
    */
    @Test
    public void testTransponerMatriz() throws Exception {
        System.out.println("Transponer Matriz");
        
        int[][] m1 = { { 3, -1, 7 }, { 8, -6, 1 }, { 4, 0, 1 } };   // Matriz 3x3
        int[][] r = { { 3, 8, 4 }, { -1, -6, 0 }, { 7, 1, 1 } };     // Matriz 3x3
        
        Matriz a = new Matriz(m1);
        System.out.println("Matriz A:\n" + a);
        int[][] expResult = r;
        System.out.println("Matriz Esperada:\n" + new Matriz(expResult));
        
        Matriz mr = Matriz.transponerMatriz(a);
        int[][] result = mr.getDatos();
        System.out.println("Matriz Resultado:\n" + mr);
        
        assertArrayEquals("Matriz transpuesta no es igual a la salida esperada",expResult, result);
    }
}
