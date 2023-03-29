package com.afpa.www.test;

import com.afpa.www.bean.Cercle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CercleTest {
    @Test
    public void cercleSurface(){

        System.out.println("--------------------------------");
        System.out.println("Calcule surface : ");

        /* Début nombre positif */
        Cercle cercle = new Cercle(5);
        cercle.surface();
        double surface1 = cercle.getSurface();
        assertEquals(78.5,surface1);
        System.out.println("Nombre positif : nombre attendu : " + 78.5 + ", nombre reçu : " + surface1);
        /* Fin nombre positif */


        /*Début nombre négatif */
        Cercle cercle1 = new Cercle(-5);
        cercle1.surface();
        double surface2 = cercle1.getSurface();
        assertEquals(78.5,surface2);
        System.out.println("Nombre négatif : nombre attendu : " + 78.5 + ", nombre reçu : " + surface2);
        /* Fin nombre négatif */

        System.out.println("--------------------------------");

    }
    @Test
    public void cerclePerimetre(){

        System.out.println("--------------------------------");
        System.out.println("Calcule périmètre : ");

        /* Début nombre positif */
        Cercle cercle = new Cercle(8);
        cercle.perimetre();
        double perimetre1 = cercle.getPerimetre();
        assertEquals(50.24,perimetre1);
        System.out.println("Nombre positif : nombre attendu : " + 50.24 + ", nombre reçu : " + perimetre1);
        /* Fin nombre positif */


        /* Début nombre négatif */
        Cercle cercle1 = new Cercle(-8);
        cercle1.perimetre();
        double perimetre2 = cercle1.getPerimetre();
        assertEquals(-50.24,perimetre2);
        System.out.println("Nombre négatif : nombre attendu : " + -50.24 + ", nombre reçu : " + perimetre2);
        /* Fin nombre négatif */

        System.out.println("--------------------------------");

    }
}
