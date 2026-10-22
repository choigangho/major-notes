
// 인터페이스

interface MyInter {
    final int x = 10; // 생략은 가능하나 가독성을 위해 final 명시하는 게 좋음
    abstract public void printX();
}

class UseInter implements MyInter {
    public void printX() {

    }
}

public class InterEx {
    public static void main(String[] args) {
        int x = 10;  // 변수 x
        x = 20;

        final int y = 10; // 상수 y 값 변경 불가능
    //  y = 20; // 불가능

    }
}
