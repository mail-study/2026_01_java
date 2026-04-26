package chap2;

public class E02_08 {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println("두 수의 차는" + ((a > b) ? (a-b) : (b-a)));
        // 삼항연산자 -> (조건) ? (참일때 결과) : (거짓일때 결과)
    }
}
