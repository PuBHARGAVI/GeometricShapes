package TestGeometricShapes;

import GeometricShapes.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    @Test
    void testRectangleAreaIsPositiveForPositiveSideValues() {
        int expectedArea = 20;

        Rectangle rectangle = new Rectangle(5, 4);
        int actualArea = (int) rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

    @Test
    void testRectangleAreaThrowsExceptionIfAnySideValueIsZero() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Zero Value";

        Rectangle rectangleWithBothSidesZeros = new Rectangle(0, 0);
        Rectangle rectangleWithLengthZero = new Rectangle(0, 3);
        Rectangle rectangleWithBreadthZero = new Rectangle(2, 0);
        String actualExceptionMessageWithBothSidesZeros = rectangleWithBothSidesZeros.area().toString();
        String actualExceptionMessageWithLengthZero = rectangleWithLengthZero.area().toString();
        String actualExceptionMessageWithBreadthZero = rectangleWithBreadthZero.area().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBothSidesZeros);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithLengthZero);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBreadthZero);
    }

    @Test
    void testRectangleAreaThrowsExceptionIfAnySideValueIsNegative() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Negative Value";

        Rectangle rectangleWithBothSidesNegative = new Rectangle(-3, -2);
        Rectangle rectangleWithLengthNegative = new Rectangle(-3, 2);
        Rectangle rectangleWithBreadthNegative = new Rectangle(2, -5);
        String actualExceptionMessageWithBothSidesNegative = rectangleWithBothSidesNegative.area().toString();
        String actualExceptionMessageWithLengthNegative = rectangleWithLengthNegative.area().toString();
        String actualExceptionMessageWithBreadthNegative = rectangleWithBreadthNegative.area().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBothSidesNegative);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithLengthNegative);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBreadthNegative);
    }

    @Test
    void testRectanglePerimeterIsPositiveForPositiveSideValues() {
        int expectedPerimeter = 18;

        Rectangle rectangle = new Rectangle(5, 4);
        int actualPerimeter = (int) rectangle.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void testRectanglePerimeterThrowsExceptionIfAnySideValueIsZero() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Zero Value";

        Rectangle rectangleWithBothSidesZeros = new Rectangle(0, 0);
        Rectangle rectangleWithLengthZero = new Rectangle(0, 3);
        Rectangle rectangleWithBreadthZero = new Rectangle(2, 0);
        String actualExceptionMessageWithBothSidesZeros = rectangleWithBothSidesZeros.perimeter().toString();
        String actualExceptionMessageWithLengthZero = rectangleWithLengthZero.perimeter().toString();
        String actualExceptionMessageWithBreadthZero = rectangleWithBreadthZero.perimeter().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBothSidesZeros);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithLengthZero);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBreadthZero);
    }


    @Test
    void testRectanglePerimeterThrowsExceptionIfAnySideValueIsNegative() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Negative Value";

        Rectangle rectangleWithBothSidesNegative = new Rectangle(-3, -2);
        Rectangle rectangleWithLengthNegative = new Rectangle(-3, 2);
        Rectangle rectangleWithBreadthNegative = new Rectangle(2, -5);
        String actualExceptionMessageWithBothSidesNegative = rectangleWithBothSidesNegative.perimeter().toString();
        String actualExceptionMessageWithLengthNegative = rectangleWithLengthNegative.perimeter().toString();
        String actualExceptionMessageWithBreadthNegative = rectangleWithBreadthNegative.perimeter().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBothSidesNegative);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithLengthNegative);
        assertEquals(expectedExceptionMessage, actualExceptionMessageWithBreadthNegative);
    }
}