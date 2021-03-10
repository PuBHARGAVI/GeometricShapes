package TestGeometricShapes;

import GeometricShapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {
    @Test
    void testSquareAreaIsPositiveForPositiveSide() {
        int expectedArea = 25;

        Square square =new Square(5);
        int actualArea = (int) square.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    void testSquareAreaIsZeroForSideValueZero() {
        int expectedArea = 0;

        Square square =new Square(0);
        int actualArea = (int) square.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    void testSquareAreaThrowsExceptionIfSideValueIsNegative() {
        String expectedExceptionMessage = "Side Value Can't Be Negative";

        Square square = new Square(-3);
        String actualExceptionMessage = square.area().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessage);
    }

    @Test
    void testSquarePerimeterIsPositiveForPositiveSide() {
        int expectedPerimeter = 20;

        Square square =new Square(5);
        int actualPerimeter = (int) square.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    void testSquarePerimeterIsZeroForSideValueZero() {
        int expectedPerimeter = 0;

        Square square =new Square(0);
        int actualPerimeter = (int) square.perimeter();

        assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    void testSquarePerimeterThrowsExceptionIfSideValueIsNegative() {
        String expectedExceptionMessage = "Side Value Can't Be Negative";

        Square square = new Square(-3);
        String actualExceptionMessage = square.perimeter().toString();

        assertEquals(expectedExceptionMessage, actualExceptionMessage);
    }
}
