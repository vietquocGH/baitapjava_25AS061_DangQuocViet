public class TestRectangle3 {
    public static void main(String[] args) {
        Rectangle3 r1 = new Rectangle3(1.2f, 3.4f);
        System.out.println(r1);
        Rectangle3 r2 = new Rectangle3();
        System.out.println(r2);

        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("chiều dài là: " + r1.getLength());
        System.out.println("chiều rộng là: " + r1.getWidth());

        System.out.printf("diện tích là: %.2f%n", r1.getArea());
        System.out.printf("chu vi là: %.2f%n", r1.getPerimeter());
    }
}
