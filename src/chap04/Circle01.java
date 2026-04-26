package chap04;

public class Circle01 {
    int radius;
    String name;

    public Circle01() {
        radius = 1;
        name = "";
    }
    public Circle01(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle01 pizza = new Circle01(10, "얼굴 피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
        Circle01 donut = new Circle01();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
