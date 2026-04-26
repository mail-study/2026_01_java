package chap04;

public class E04_01 {
    public static class Circle {
        int radius;
        String name;

        public Circle() { };

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.name = "피자";
        pizza.radius = 10;
        double area = pizza.getArea();

        System.out.println(pizza.name + " 의 면적은 " + area);


    }
}
