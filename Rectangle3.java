public class Rectangle3 {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle3() {
    }
    public Rectangle3(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return(double) length * width;}
    public double getPerimeter() {
        return 2.0 * (length + width); }
@Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
