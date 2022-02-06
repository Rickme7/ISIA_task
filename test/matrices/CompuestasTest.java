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
public class CompuestasTest {
    
    public CompuestasTest() {
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
     * Test que controla que la transpuesta de una matriz transpuesta sea igual a la original.
     */
    @Test
    public void testTransponerMatrizTranspuesta() throws Exception {
        System.out.println("Transponer Matriz Transpuesta");
        
        int[][] mo = { { 3, -1, 7 }, { 8, -6, 1 }, { 4, 0, 1 } };   // Matriz 3x3
        int[][] mt = { { 3, 8, 4 }, { -1, -6, 0 }, { 7, 1, 1 } };     // Matriz 3x3
        
        Matriz t = new Matriz(mt);
        System.out.println("Matriz Transpuesta:\n" + t);
        
        int[][] expResult = mo;
        System.out.println("Matriz Esperada (Original):\n" + new Matriz(expResult));
        
        Matriz mr = Matriz.transponerMatriz(t);
        int[][] result = mr.getDatos();
        System.out.println("Matriz Resultado:\n" + mr);
        
        assertArrayEquals("La transpuesta de la matriz transpuesta no es igual a la original",expResult, result);
    }
    
    
    /**
     * Test que controla que la transpuesta de la multiplicación de dos matrices sea igual al producto de sus transpuestas.
     */
    @Test
    public void testTranspuestaProductoMatrices() throws Exception {
        System.out.println("Transpuesta del producto vs Producto de las transpuestas");
        
        int[][] m1 = { { 3, -1, 7 }, { 8, -6, 1 }, { 4, 0, 1 } };   // Matriz 3x3
        int[][] m2 = { { 5, 2, 7 }, { 9, 6, 3 }, { -7, 4, -8 } }; // Matriz 3x3
        int[][] r = { { -43, 28, -38 }, { -21, -16, 30 }, { 13, 12, 20 } };     // Matriz 3x3
        
        Matriz a = new Matriz(m1);
        System.out.println("Matriz A:\n" + a);
        Matriz b = new Matriz(m2);
        System.out.println("Matriz B:\n" + a);
        Matriz mp = Matriz.multiplicarDosMatrices(a, b);
        Matriz mrtp = Matriz.transponerMatriz(mp);
        int[][] result_tp = mrtp.getDatos();
        System.out.println("Transpuesta del producto:\n" + mrtp);
    
        Matriz at = Matriz.transponerMatriz(a);
        System.out.println("Matriz A Transpuesta:\n" + at);
        Matriz bt = Matriz.transponerMatriz(b);
        System.out.println("Matriz B Transpuesta:\n" + at);
        Matriz mrpt = Matriz.multiplicarDosMatrices(bt, at);
        int[][] result_pt = mrpt.getDatos();
        System.out.println("Producto de las transpuestas:\n" + mrpt);
        
        assertArrayEquals("La transpuesta del producto no es igual al producto de las transpuestas", result_tp, result_pt);
    }
}
