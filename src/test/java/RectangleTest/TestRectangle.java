package RectangleTest;

import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    @Test
    void testAreaIsPositiveForPositiveSideValues() {
        int expectedArea = 20;

        Rectangle rectangle = new Rectangle(5, 4);
        int actualArea = (int) rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

    @Test
    void testAreaIsZeroForAnySideValuesZero() {
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
    void testAreaThrowsExceptionIfAnySideValueIsNegative() {
        String expectedExceptionMessage = "Side Value Can't Be Negative";

        Rectangle rectangleWithBothSidesNegative = new Rectangle(-3, -2);
        Rectangle rectangleWithLengthNegative = new Rectangle(-3, 2);
        Rectangle rectangleWithBreadthNegative = new Rectangle(2, -5);

        assertEquals(expectedExceptionMessage, rectangleWithBothSidesNegative.area());
        assertEquals(expectedExceptionMessage, rectangleWithLengthNegative.area());
        assertEquals(expectedExceptionMessage, rectangleWithBreadthNegative.area());
    }

    @Test
    void testPerimeterIsPositiveForPositiveSideValues() {
        int expectedPerimeter = 18;

        Rectangle rectangle = new Rectangle(5, 4);
        int actualPerimeter = (int) rectangle.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void testPerimeterIsZeroForBothSideValuesZero() {
        int expectedPerimeter = 0;

        Rectangle rectangle = new Rectangle(0, 0);
        int actualPerimeter = (int) rectangle.perimeter();

        assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    void testPerimeterIsNotZeroForOneSideValueZero() {
        int expectedPerimeterWithLengthZero = 8;
        int expectedPerimeterWithBreadthZero = 10;

        Rectangle rectangleWithLengthZero = new Rectangle(0, 4);
        Rectangle rectangleWithBreadthZero = new Rectangle(5,0);
        int actualPerimeterWithLengthZero = (int) rectangleWithLengthZero.perimeter();
        int actualPerimeterWithBreadthZero = (int) rectangleWithBreadthZero.perimeter();

        assertEquals(expectedPerimeterWithLengthZero, actualPerimeterWithLengthZero);
        assertEquals(expectedPerimeterWithBreadthZero,actualPerimeterWithBreadthZero);
    }
}
