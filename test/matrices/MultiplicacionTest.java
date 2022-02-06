/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.awt.Dimension;
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
public class MultiplicacionTest {
    
    public MultiplicacionTest() {
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
     * Test que chequea que devuelva excepción si se pasan 2 matrices de dimensiones incompatibles.
    */
    @Test
    public void testExpectedExceptionMultiplicar(){
        System.out.println("Expected Exception Multiplicar\n");
        assertThrows("DimensionesIncompatiblesException was expected.", DimensionesIncompatibles.class, ()-> {
            Matriz a = new Matriz(3, 2, true);
            Matriz b = new Matriz(3, 1, true);
            Matriz.multiplicarDosMatrices(a, b);
        });
    }

    /**
     * Test que controla que la multiplicación de dos matrices sea igual a la salida esperada.
    */
    @Test
    public void testMultiplicarDosMatrices() throws Exception {
        System.out.println("Multiplicar Dos Matrices");

        int[][] m1 = { { 3, -1, 7 }, { 8, -6, 1 }, { 4, 0, 1 } };   // Matriz 3x3
        int[][] m2 = { { 5, 2, 7 }, { 9, 6, 3 }, { -7, 4, -8 } }; // Matriz 3x3
        int[][] r = { { -43, 28, -38 }, { -21, -16, 30 }, { 13, 12, 20 } };     // Matriz 3x3
        
     
        Matriz a = new Matriz(m1);
        System.out.println("Matriz A:\n" + a);
        Matriz b = new Matriz(m2);
        System.out.println("Matriz B:\n" + a);
        int[][] expResult = r;
        System.out.println("Matriz Esperada:\n" + new Matriz(expResult));
        
        Matriz mr = Matriz.multiplicarDosMatrices(a, b);
        int[][] result = mr.getDatos();
        System.out.println("Matriz Resultado:\n" + mr);

        assertArrayEquals("El resultado de la multiplicacióm de las matrices no es igual a la salida esperada", expResult, result);
    }   
}
