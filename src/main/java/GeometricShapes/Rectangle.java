package GeometricShapes;

public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private void CheckForZeroSideValueException() throws ZeroSideValueException {
        if ((length == 0 || breadth == 0) && length != breadth)
            throw new ZeroSideValueException("Rectangle Sides Do Not Support Zero Value");
        else if (length == 0)
            throw new ZeroSideValueException("Square Side Do Not Support Zero Value");
    }

    private void CheckForNegativeSideValueException() throws NegativeSideValueException {
        if ((length < 0 || breadth < 0) && length != breadth)
            throw new NegativeSideValueException("Rectangle Sides Do Not Support Negative Value");
        else if (length < 0)
            throw new NegativeSideValueException("Square Side Do Not Support Negative Value");
    }

    public Object area() {
        try {
            CheckForNegativeSideValueException();
            CheckForZeroSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return length * breadth;
    }

    public Object perimeter() {
        try {
            CheckForNegativeSideValueException();
            CheckForZeroSideValueException();
        } catch (Exception ne) {
            return ne.getMessage();
        }
        return 2 * (length + breadth);
    }
}
