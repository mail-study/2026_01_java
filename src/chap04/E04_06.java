package chap04;

public class E04_06 {
    static class Circle {
        int radius;
        public Circle(int radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Circle [] c;
        c = new Circle[5];

        for (int i = 0; i < 5; i++) {
            c[i] = new Circle(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((int)c[i].getArea());
        }
    }
}
