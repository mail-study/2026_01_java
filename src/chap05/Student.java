package chap05;

public class Student extends Person {
    public void set() {
        age = 30;
        name = "김다혜";
        height = 180;
        //weight = 70; : 오류 : 슈퍼 클래스의 private 접근 불가
        setWeight(70); // private 멤버 weight 은 setWeight() 접근
    }
}
