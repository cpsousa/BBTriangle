package bbtriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(0, 0, 0);
    }

    @Test
    void testClassifyImpossible_ReturnImpossible_Valid() {
        triangle.setSideLengths(-1, 2, 3);

        String expected = "impossible";

        assertEquals(expected, triangle.classify());
    }

    @Test
    void testClassifyEquilateral_ReturnEquilateral_Valid() {
        triangle.setSideLengths(1, 1, 1);

        String expected = "equilateral";

        assertEquals(expected, triangle.classify());
    }

    @Test
    void testClassifyIsossceles_ReturnIsossceles_Valid() {
        triangle.setSideLengths(1, 1, 3);

        String expected = "isossceles";

        assertEquals(expected, triangle.classify());
    }

    @Test
    void testClassifyRightAngled_ReturnRightAngled_Valid() {
        triangle.setSideLengths(5, 3, 4);

        String expected = "right-angled";

        assertEquals(expected, triangle.classify());
    }

    @Test
    void testClassifyScalene_ReturnScalene_Valid() {
        triangle.setSideLengths(1, 2, 3);

        String expected = "scalene";

        assertEquals(expected, triangle.classify());
    }
}
