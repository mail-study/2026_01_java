package chap06;

public class WrapperClass {

    public static void main(String[] args) {

        Integer i = Integer.valueOf(10);
        int ii = i.intValue(); // ii = 10

        Character c = Character.valueOf('c' );
        char cc = c.charValue(); // cc = ’c’

        Double d = Double.valueOf(3.14);
        double dd = d.doubleValue(); // dd = 3.14

        Boolean b = Boolean.valueOf(true);
        boolean bb = b.booleanValue(); // bb = true

        String s1 = Integer.toString(123); 	// 정수 123을 문자열 "123" 으로 변환
        String s2 = Integer.toHexString(123); 	// 정수 123을 16진수의 문자열 "7b"로 변환
        String s3 = Double.toString(3.14); 	// 실수 3.14를 문자열 "3.14"로 변환
        String s4 = Boolean.toString(true); 	// 불린 값 true를 문자열 "true"로 변환


    }
}
