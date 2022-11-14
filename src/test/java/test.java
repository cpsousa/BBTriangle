import java.beans.Transient;

import org.junit.jupiter.api.*;

import triangle.Triangle;

public class test {

    @Test
    public void ecp1() {
        String expected = "equilateral";
        Triangle triangle = new Triangle(3, 3, 3);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle should be equilateral");
    }

    @Test
    public void ecp2() {
        String expected = "impossible";
        Triangle triangle = new Triangle(-1, 3, 3);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle should be impossible");
    }

    @Test
    public void ecp3() {
        String expected = "isossceles";
        Triangle triangle = new Triangle(2, 2, 1);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle should be isossceles");
    }

    @Test
    public void ecp4() {
        String expected = "impossible";
        Triangle triangle = new Triangle(1, -30, 1);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle shouldn't be possible");
    }

    @Test
    public void ecp5() {
        String expected = "scalene";
        Triangle triangle = new Triangle(10, 20, 50);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle should be scalene");
    }

    @Test
    public void ecp6() {
        String expected = "impossible";
        Triangle triangle = new Triangle(-10, 20, 50);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle shouldn't be possible");
    }

    @Test
    public void ecp7() {
        String expected = "impossible";
        Triangle triangle = new Triangle(5, -1, 3);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle shouldn't be possible");
    }

    @Test
    public void ecp8() {
        String expected = "scalene";
        Triangle triangle = new Triangle(1, 2, 3);
        Assertions.assertEquals(expected, triangle.classify(), "Triangle should be possible");
    }

    @Test
    public void bva1() {
        String expected = "impossible";
        Triangle triangle = new Triangle(0, 0, 0);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva2() {
        String expected = "impossible";
        Triangle triangle = new Triangle(0, 2147483647, 2147483647);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva3() {
        String expected = "impossible";
        Triangle triangle = new Triangle(0, 0, 2147483647);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva4() {
        String expected = "impossible";
        Triangle triangle = new Triangle(0, 2147483647, 0);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva5() {
        String expected = "impossible";
        Triangle triangle = new Triangle(2147483647, 2147483647, 0);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva6() {
        String expected = "impossible";
        Triangle triangle = new Triangle(2147483647, 0, 0);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva7() {
        String expected = "impossible";
        Triangle triangle = new Triangle(2147483647, 0, 2147483647);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva8() {
        String expected = "equilateral";
        Triangle triangle = new Triangle(2147483647, 2147483647, 2147483647);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
    public void bva9() {
        String expected = "impossible";
        Triangle triangle = new Triangle(null, null, null);
        Assertions.assertEquals(expected, triangle.classify(), "This should not work");
    }

    @Test
            public void bva10(){
            String expected = "impossible";
            Triangle triangle = new Triangle(2147483648, 2147483648, 2147483648);
            Assertions.assertEquals(expected,triangle.classify(),"This should not work");
            }

}
