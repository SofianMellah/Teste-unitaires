package com.afpa.www.test;

import com.afpa.www.bean.Carre;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarreTest {
    @Test
    public void carreSurface(){

        System.out.println("--------------------------------");
        System.out.println("Calcule surface : ");

        /* Début nombre positif */
        Carre carre = new Carre(2);
        carre.surface();
        double surface1 = carre.getSurface();
        assertEquals(4, surface1);
        System.out.println("Nombre positif : nombre attendu : " + 4 + ", nombre reçu : " + surface1);
        /* Fin nombre positif */


        /* Début nombre négatif */
        Carre carre1 = new Carre(-2);
        carre1.surface();
        double surface2 = carre1.getSurface();
        assertEquals(4, surface2);
        System.out.println("Nombre négatif : nombre attendu : " + 4 + ", nombre reçu : " + surface2);
        /* Fin nombre négatif */


        /* Début nombre 0 */
        /*Carre carre2 = new Carre(0);
        carre2.surface();
        double surface3 = carre2.getSurface();
        assertEquals(null, surface3);*/
        /* Fin nombre 0 */

        System.out.println("--------------------------------");

    }

    @Test
    public void carrePerimetre(){

        System.out.println("--------------------------------");
        System.out.println("Calcule périmètre : ");

        /* Début nombre positif */
        Carre carre = new Carre(5);
        carre.perimetre();
        double perimetre1 = carre.getPerimetre();
        assertEquals(20,perimetre1);
        System.out.println("Nombre positif : nombre attendu : " + 20 + ", nombre reçu : " + perimetre1);
        /* Fin nombre positif */


        /* Début nombre négatif */
        Carre carre1 = new Carre(-5);
        carre1.perimetre();
        double perimetre2 = carre1.getPerimetre();
        assertEquals(-20, perimetre2);
        System.out.println("Nombre négatif : nombre attendu : " + 20 + ", nombre reçu : " + perimetre2);
        /* Fin nombre négatif */

        System.out.println("--------------------------------");
    }

    @Test
    public void doublerSurface(){

        System.out.println("--------------------------------");
        System.out.println("Doubler la surface : ");

        /* Début nombre positif */
        Carre carre = new Carre(2);
        carre.doublerSurface();
        double doubler1 = carre.getSurface();
        assertEquals(8,doubler1);
        System.out.println("Nombre positif : nombre attendu : " + 8 + ", nombre reçu : " + doubler1);
        /* Fin nombre positif */


        /* Début nombre négatif */
        Carre carre1 = new Carre(-2);
        carre1.doublerSurface();
        double doubler2 = carre1.getSurface();
        assertEquals(8,doubler2);
        System.out.println("Nombre négatif : nombre attendu : " + 8 + ", nombre reçu : " + doubler2);
        /* Fin nombre négatif */

        System.out.println("--------------------------------");

    }
}
