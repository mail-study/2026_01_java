class A {
    String f() { return "A-f"; }
    String g() { return f(); }
}
class B extends A {
    String f() { return "B-f"; }

    public static void main(String[] args) {
            A a1 = new A(), a2 = new B();
            System.out .println(a1.f()); // ( )
            System.out .println(a2.g()); // ( )
            System.out .println(a2 instanceof A); // ( )
        }
    }