package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example03_15 {
    public static class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int n, m;

            while (true) {
                try {
                    System.out.print("곱하고자 하는 정수 2개 입력>> ");

                    n = scanner.nextInt();
                    m = scanner.nextInt();

                    break;

                } catch (InputMismatchException e) {

                    System.out.println("정수를 입력하세요!");

                    scanner.nextLine();
                }
            }

            System.out.println(n + "x" + m + "=" + (n * m));

            scanner.close();
        }
    }
}
