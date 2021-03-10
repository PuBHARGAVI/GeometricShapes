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
    void testAreaIsZeroForBothSideValuesZero() {
        int expectedArea = 0;

        Rectangle rectangle = new Rectangle(0, 0);
        int actualArea = rectangle.area();

        assertEquals(expectedArea, actualArea);
    }
}
