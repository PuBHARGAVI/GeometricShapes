package RectangleTest;

import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
    @Test
    void testAreaIsPositiveForPositiveSideValues() {
        int expectedArea = 20;

        Rectangle rectangle = new Rectangle(5, 4);
        int actualArea = rectangle.area();

        assertEquals(expectedArea, actualArea);
    }

    @Test
    void testAreaIsZeroForAnySideValuesZero() {
        int expectedArea = 0;

        Rectangle rectangleWithBothSidesZero = new Rectangle(0, 0);
        Rectangle rectangleWithLengthZero = new Rectangle(0, 4);
        Rectangle rectangleWithBreadthZero = new Rectangle(5, 0);
        int actualAreaWithBothSidesZero = rectangleWithBothSidesZero.area();
        int actualAreaWithLengthZero = rectangleWithLengthZero.area();
        int actualAreaWithBreadthZero = rectangleWithBreadthZero.area();

        assertEquals(expectedArea, actualAreaWithBothSidesZero);
        assertEquals(expectedArea, actualAreaWithLengthZero);
        assertEquals(expectedArea, actualAreaWithBreadthZero);
    }
}
