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
    void testRectangleAreaIsZeroForAnySideValuesZero() {
        int expectedArea = 0;

        Rectangle rectangleWithBothSidesZero = new Rectangle(0, 0);
        Rectangle rectangleWithLengthZero = new Rectangle(0, 4);
        Rectangle rectangleWithBreadthZero = new Rectangle(5, 0);
        int actualAreaWithBothSidesZero = (int) rectangleWithBothSidesZero.area();
        int actualAreaWithLengthZero = (int) rectangleWithLengthZero.area();
        int actualAreaWithBreadthZero = (int) rectangleWithBreadthZero.area();

        assertEquals(expectedArea, actualAreaWithBothSidesZero);
        assertEquals(expectedArea, actualAreaWithLengthZero);
        assertEquals(expectedArea, actualAreaWithBreadthZero);
    }

    @Test
    void testRectangleAreaThrowsExceptionIfAnySideValueIsNegative() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Negative And Zero Value";

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
    void testRectanglePerimeterIsZeroForBothSideValuesZero() {
        int expectedPerimeter = 0;

        Rectangle rectangle = new Rectangle(0, 0);
        int actualPerimeter = (int) rectangle.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void testRectanglePerimeterIsNotZeroForOneSideValueZero() {
        int expectedPerimeterWithLengthZero = 8;
        int expectedPerimeterWithBreadthZero = 10;

        Rectangle rectangleWithLengthZero = new Rectangle(0, 4);
        Rectangle rectangleWithBreadthZero = new Rectangle(5,0);
        int actualPerimeterWithLengthZero = (int) rectangleWithLengthZero.perimeter();
        int actualPerimeterWithBreadthZero = (int) rectangleWithBreadthZero.perimeter();

        assertEquals(expectedPerimeterWithLengthZero, actualPerimeterWithLengthZero);
        assertEquals(expectedPerimeterWithBreadthZero,actualPerimeterWithBreadthZero);
    }

    @Test
    void testRectanglePerimeterThrowsExceptionIfAnySideValueIsNegative() {
        String expectedExceptionMessage = "Rectangle Sides Do Not Support Negative And Zero Value";

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