package chap03;

import java.util.Scanner;

public class E03_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 배열 생성 방법
        * (1) : 배열에 대한 레퍼런스 변수 intArray 선언 : int Array []; (배열 타입 , 배열에 대한 레퍼런스 변수, 배열 선언)
        * (2) : 배열 생성 : intArray = new int [5]; (배열에 대한 레퍼런스 변수, 배열 생성, 타입, 원소 개수)
        *  */
        int intArray[] = new int[5]; // 5칸 짜리 배열 생성
        int max = -1;
        int mean = 0;
        System.out.println("양수 5개를 입력하시오");
        for (int i=0;i<5;i++){
            intArray[i] = scanner.nextInt();
            mean += intArray[i];
            if (intArray[i]>max){
                max = intArray[i];
            }
        }

        System.out.println("가장 큰 수 : " + max);
        System.out.println("배열 평균: " + mean / intArray.length);

        scanner.close();
    }
}
