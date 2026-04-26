package chap04;

public class E04_10 {
    static class Sample {
        private int a;
        private int b;
        int c;
    }
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 20;
        aClass.c = 30;
        }
    }

// Sample 클래스의 a 와 c 는 각각 public, default 지정자로 선언이 되었으므로 , 같은 패키지에 속한 AccessEx 클래스에서 접근 가능
// b 는 private 으로 선언이 되었으므로 AccessEx 클래스에서 접근 불가능
