package GeometricShapes;

public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void CheckForNegativeSideValueException() throws NegativeSideValueException {
        if (length < 0 || breadth < 0 && length != breadth)
            throw new NegativeSideValueException("Rectangle Sides Do Not Support Negative And Zero Value");
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
