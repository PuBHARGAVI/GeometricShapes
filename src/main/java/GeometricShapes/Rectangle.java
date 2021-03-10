package GeometricShapes;

public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void CheckForNegativeSideValueException() throws NegativeSideValueException {
        if (length < 0 || breadth < 0)
            throw new NegativeSideValueException("Side Value Can't Be Negative");
    }

    public Object area() {
        try {
            CheckForNegativeSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return length * breadth;
    }

    public Object perimeter() {
        try {
            CheckForNegativeSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return 2 * (length + breadth);
    }
}
