package triangle;

import org.junit.jupiter.api.*;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void setUp() {
        triangle = new Triangle(2, 4, 6);
    }

    @Test
    public void testTriangleValidClassifyIsIsosceles() {
        triangle.setSideLengths(2, 2, 4);

        String expected = "isosceles";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleInvalidClassifyIsIsosceles() {
        String expected = "isosceles";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleValidClassifyIsImpossible() {
        triangle.setSideLengths(-2, 2, 4);

        String expected = "impossible";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleInvalidClassifyIsImpossible() {
        String expected = "impossible";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleValidClassifyIsEquilateral() {
        triangle.setSideLengths(4, 4, 4);

        String expected = "equilateral";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleInvalidClassifyIsEquilateral() {
        String expected = "equilateral";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleValidClassifyIsRightAngled() {
        triangle.setSideLengths(7, 24, 25);

        String expected = "right-angled";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleInvalidClassifyIsRightAngled() {
        triangle.setSideLengths(1, 1, 1);

        String expected = "right-angled";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleValidClassifyIsScalene() {
        String expected = "scalene";

        Assertions.assertEquals(expected, triangle.classify());
    }

    @Test
    public void testTriangleInvalidClassifyIsScalene() {
        triangle.setSideLengths(0, 0, 0);

        String expected = "scalene";

        Assertions.assertEquals(expected, triangle.classify());
    }

}
