package chap2;

public class E02_06 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        a += 3;
        b *= 3;
        c %= 2;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d=3;
        a = d++; // a=3, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = ++d; // d=5, a=5
        System.out.println("a=" + a + ", d=" + d);
        a = d--; // a=5, d=4
        System.out.println("a=" + a + ", d=" + d);
        a = --d; // d=3, a=3
        System.out.println("a=" + a + ", d=" + d);

        // a = d++; : a에 d 값 넣고 -> 그 다음 d 증가, 선 대입 후 사용
        // a = ++d; : d 먼저 증가 -> 그 값을 a에 넣음 선 사용 후 대입
    }
}
