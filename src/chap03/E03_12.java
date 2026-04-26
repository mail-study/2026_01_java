package chap03;

public class E03_12 {
    static int[] makeArray(){
        int temp[] = new int[4];
        for(int i=0;i<temp.length;i++){
            temp[i]=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        int intArray[];
        intArray = makeArray();

        for(int i=0;i<intArray.length;i++){ // 메소드로부터 배열 전달받음
            System.out.print(intArray[i] + " ");
        }
    }
}
