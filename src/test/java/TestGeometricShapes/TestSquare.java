package TestGeometricShapes;

import GeometricShapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {
    @Test
    void testAreaIsPositiveForPositiveSide() {
        int expectedArea = 25;

        Square square =new Square(5);
        int actualArea = (int) square.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    void testAreaIsZeroForSideValueZero() {
        int expectedArea = 0;

        Square square =new Square(0);
        int actualArea = (int) square.area();

        assertEquals(expectedArea,actualArea);
    }
}
