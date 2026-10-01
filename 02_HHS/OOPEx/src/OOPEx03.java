class A {
    public A() {
        System.out.println("A가 객체화됨");
    }
}

class B extends A {
    public B() { // 생략) 디폴트 생성자
        super(); // 생략) 상위 클래스 생성자를 호출
    }
}

// 시험문제 답안
public class OOPEx03 {
    public static void main(String[] args) {
        new B(); // A가 객체화됨 -> 왜 됨? -> B는 A를 상속(extends)받아서
//            A c = new B(); // 권장되는 코드
//            B b = new A(); // 오류.. 메모리상의 A에는 B가 없음

    }
}