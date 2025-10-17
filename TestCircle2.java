public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(1.1);
        System.out.println(c1);
        Circle2 c2 = new Circle2();
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("Radius is: " + c1.getRadius());
        System.out.printf("Area is: %.2f%n", c1.getArea());
        System.out.printf("Circumference is: %.2f%n", c1.getCircumference());
    }
}
