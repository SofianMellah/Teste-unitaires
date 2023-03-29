package com.afpa.www.test;

import com.afpa.www.bean.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {
    @Test
    public void rectangleSurface(){

        System.out.println("--------------------------------");
        System.out.println("Calcule surface : ");

        /* Début nombres positif */
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.surface();
        double rect1 = rectangle.getSurface();
        assertEquals(200, rect1);
        System.out.println("Nombre positif - positif : nombre attendu : " + 200 + ", nombre reçu : " + rect1);
        /* Fin nombres positif */


        /* Début nombres positif - négatif */
        Rectangle rectangle1 = new Rectangle(10,-20);
        rectangle1.surface();
        double rect2 = rectangle1.getSurface();
        assertEquals(-200, rect2);
        System.out.println("Nombre positif - négatif : nombre attendu : " + -200 + ", nombre reçu : " + rect2);
        /* Fin nombres positif - négatif */


        /* Début nombres négatif - positif */
        Rectangle rectangle2 = new Rectangle(-10,20);
        rectangle2.surface();
        double rect3 = rectangle2.getSurface();
        assertEquals(-200, rect3);
        System.out.println("Nombre négatif - positif : nombre attendu : " + -200 + ", nombre reçu : " + rect3);
        /* Fin nombres négatif - positif */


        /* Début nombres négatif - négatif */
        Rectangle rectangle3 = new Rectangle(-10,-20);
        rectangle3.surface();
        double rect4 = rectangle3.getSurface();
        assertEquals(200, rect4);
        System.out.println("Nombre négatif - négatif : nombre attendu : " + 200 + ", nombre reçu : " + rect4);
        /* Fin nombres négatif - négatif */

        System.out.println("--------------------------------");

    }
    @Test
    public void rectanglePerimetre(){

        System.out.println("--------------------------------");
        System.out.println("Calcule périmètre : ");

        /* Début nombres positif */
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.perimetre();
        double rect1 = rectangle.getPerimetre();
        assertEquals(60, rect1);
        System.out.println("Nombre positif - positif : nombre attendu : " + 60 + ", nombre reçu : " + rect1);
        /* Fin nombres positif */


        /* Début nombre positif - négatif */
        Rectangle rectangle1 = new Rectangle(10,-20);
        rectangle1.perimetre();
        double rect2 = rectangle1.getPerimetre();
        assertEquals(-20, rect2);
        System.out.println("Nombre positif - négatif : nombre attendu : " + -20 + ", nombre reçu : " + rect2);
        /* Fin nombre positif - négatif */


        /* Début nombre négatif - positif */
        Rectangle rectangle3 = new Rectangle(-10,20);
        rectangle3.perimetre();
        double rect3 = rectangle3.getPerimetre();
        assertEquals(20, rect3);
        System.out.println("Nombre négatif - positif : nombre attendu : " + 10 + ", nombre reçu : " + rect3);
        /* Fin nombre négatif - positif */


        /* Début nombre négatif - négatif */
        Rectangle rectangle4 = new Rectangle(-10,-20);
        rectangle4.perimetre();
        double rect4 = rectangle4.getPerimetre();
        assertEquals(-60, rect4);
        System.out.println("Nombre négatif - négatif : nombre attendu : " + -60 + ", nombre reçu : " + rect4);
        /* Fin nombre négatif - négatif */

        System.out.println("--------------------------------");

    }

    @Test
    public void doublerSurface(){

        System.out.println("--------------------------------");
        System.out.println("Doubler la surface : ");

        /* Début nombres positif */
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.doublerSurface();
        double doubler1 = rectangle.getSurface();
        assertEquals(400, doubler1);
        System.out.println("Nombre positif - positif : nombre attendu : " + 120 + ", nombre reçu : " + doubler1);
        /* Fin nombres positif */


        /* Début nombre positif - négatif */
        Rectangle rectangle1 = new Rectangle(10,-20);
        rectangle1.doublerSurface();
        double doubler2 = rectangle1.getSurface();
        assertEquals(-400, doubler2);
        System.out.println("Nombre positif - négatif : nombre attendu : " + -40 + ", nombre reçu : " + doubler2);
        /* Fin nombre positif - négatif */


        /* Début nombre négatif - positif */
        Rectangle rectangle3 = new Rectangle(-10,20);
        rectangle3.doublerSurface();
        double doubler3 = rectangle3.getSurface();
        assertEquals(-400, doubler3);
        System.out.println("Nombre négatif - positif : nombre attendu : " + 40 + ", nombre reçu : " + doubler3);
        /* Fin nombre négatif - positif */


        /* Début nombre négatif - négatif */
        Rectangle rectangle4 = new Rectangle(-10,-20);
        rectangle4.doublerSurface();
        double doubler4 = rectangle4.getSurface();
        assertEquals(400, doubler4);
        System.out.println("Nombre négatif - négatif : nombre attendu : " + -120 + ", nombre reçu : " + doubler4);
        /* Fin nombre négatif - négatif */

        System.out.println("--------------------------------");

    }
}
