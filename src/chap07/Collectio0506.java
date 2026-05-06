package chap07;

import java.util.ArrayList;

public class Collectio0506 {
    public static void main(String[] args) {
        /**
         *  요소 객체들의 저장소
         *  객체들의 컨테이너, 요소의 개수에 따라 자동으로 조절
         *  요소의 삽입 삭제에 따른 요소의 위치 자동으로 이동
         * -> 고정 크기의 배열을 다루는 어려움 해소
         * 고정 크기의 배열을 다루는 어려움 해소
         */

        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("Spring");

        list.add("JPA");

        list.add("MySQL");

        // 출력
        System.out.println(list);

        // 특정 인덱스 조회
        System.out.println(list.get(1));

        // 수정
        list.set(1, "Hibernate");

        // 삭제
        list.remove(0);

        // 반복문
        for (String s : list) {
            System.out.println(s);

        }
    }
}
