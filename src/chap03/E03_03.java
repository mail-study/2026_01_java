package chap03;

public class E03_03 {
    public static void main (String[] args) {
        char c = 'a';
        do {
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z');
    }
}
// Do while문은 최소 1회 실행 보장
// 조건 검사보다 실행을 먼저 하니까!
