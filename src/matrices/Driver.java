package matrices;

import java.util.logging.Level;
import java.util.logging.Logger;
import matrices.DimensionesIncompatibles;
import matrices.Matriz;

public class Driver {

    public static void main(String[] args) {
     
        try {
            
            System.out.println("Suma de Matrices");
            Matriz m1 = new Matriz(3, 4, true);
            System.out.println("Matriz A:\n" + m1);
            Matriz m2 = new Matriz(3, 4, true);
            System.out.println("Matriz B:\n" + m2);
            System.out.println("Matriz Resultado:\n" + Matriz.sumarDosMatrices(m1, m2));

            System.out.println("Multiplicacion de Matrices");
            Matriz m3 = new Matriz(3, 3, true);
            System.out.println("Matriz A:\n" + m3);
            Matriz m4 = new Matriz(3, 3, true);
            System.out.println("Matriz B:\n" + m4);
            System.out.println("Matriz Resultado:\n" + Matriz.multiplicarDosMatrices(m3, m4));
 
            System.out.println("Transponer Matriz");
            Matriz m5 = new Matriz(3, 3, true);
            System.out.println("Matriz A:\n" + m5);
            System.out.println("Matriz Resultado:\n" + Matriz.transponerMatriz(m5));
            
        } catch (DimensionesIncompatibles ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

}
