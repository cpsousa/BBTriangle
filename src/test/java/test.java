import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import triangle.Triangle;

public class test {

    @Test
    public void ECP1() {

        Triangle equilatero = new Triangle(3, 3, 3);
        String expected = "equilateral";
        Assertions.assertEquals(expected, equilatero.classify(), "Should return equilateral");

    }

    @Test
    public void ECP2() {

        Triangle equilatero = new Triangle(-1, 3, 3);
        String expected = "impossible";
        Assertions.assertEquals(expected, equilatero.classify(), "Should return a impossible");

    }

    @Test
    public void ECP3() {

        Triangle isosceles = new Triangle(4, 4, 2);
        String expected = "isossceles";
        Assertions.assertEquals(expected, isosceles.classify(), "Should return isossceles");

    }

    @Test
    public void ECP4() {

        Triangle isosceles = new Triangle(-1, -2, 1);
        String expected = "impossible";
        Assertions.assertEquals(expected, isosceles.classify(), "Should return impossible");

    }

    @Test
    public void ECP5() {

        Triangle escaleno = new Triangle(1, 2, 3);
        String expected = "scalene";
        Assertions.assertEquals(expected, escaleno.classify(), "Should return scalene");

    }

    @Test
    public void ECP6() {

        Triangle escaleno = new Triangle(1, -2, 3);
        String expected = "impossible";
        Assertions.assertEquals(expected, escaleno.classify(), "Should return impossible");

    }

    @Test
    public void BVA() {

        Triangle triangulo = new Triangle(0, 0, 0);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA2() {

        Triangle triangulo = new Triangle(0, 0, 2147483647);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA3() {

        Triangle triangulo = new Triangle(0, 2147483647, 0);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA4() {

        Triangle triangulo = new Triangle(2147483647, 0, 0);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA5() {

        Triangle triangulo = new Triangle(0, 2147483647, 2147483647);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA6() {

        Triangle triangulo = new Triangle(2147483647, 2147483647, 0);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA7() {

        Triangle triangulo = new Triangle(2147483647, 0, 2147483647);
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    @Test
    public void BVA8() {

        Triangle triangulo = new Triangle(2147483647, 2147483647, 2147483647);
        String expected = "equilateral";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return equilateral");
    }

    @Test
    public void BVA9() {

        Triangle triangulo = new Triangle((2147483647 + 1), (2147483647 + 1), (2147483647 + 1));
        String expected = "impossible";
        Assertions.assertEquals(expected, triangulo.classify(), "Should return impossible");
    }

    /*
     * @Test
     * public void BVA10(){
     * 
     * Triangle triangulo = new Triangle(null, null, null);
     * String expected = "impossible";
     * Assertions.assertEquals(expected,
     * triangulo.classify(),"Should return impossible");
     * }
     */

}
