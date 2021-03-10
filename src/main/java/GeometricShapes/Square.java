package GeometricShapes;

public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public void CheckForNegativeSideValueException() throws NegativeSideValueException {
        if (side < 0)
            throw new NegativeSideValueException("Side Value Can't Be Negative");
    }

    public Object area() {
        try {
            CheckForNegativeSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return side * side;
    }

    public Object perimeter() {
        try {
            CheckForNegativeSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return 4 * side;
    }
}
