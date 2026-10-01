// 2. 상속
// - 자바에서 상속 대상은 클래스
// - 문법적으로 상속을 받기 위해 "extends" 키워드를 사용
// ex) calss A extends B {} -> A 클래스는 B 클래스를 상속받는다
// * 자바에서는 단일 상속만 지원

// - 그렇다면 상속의 대상이 클래스의 멤버변수, 메소드, 생성자를 전부 상속받는다 라고 보면되나?

class MyA{ // 하드디스크에 존재 (JVM 영역 X) -> 클래스 단위로 메모리(JVM 영역 O)에 올릴 수 있고 그걸 위해 객체화(메모리(JVM 영역 O))
    int x = 10;

    public MyA() {}

    public MyA(int x) { // 생성자 상속이 안됨 -> 만약 해당 라인이 길다면?
        this.x = x;
        // 만약 여기 알고리즘이 100 ~ 1000 라인이라면?

    }

    public void printX() {
        System.out.println("x = " + x);
    }
}

class MyB extends MyA{
        // 생성자 상속이 안됨.. 100 ~ 1000 라인을 복붙...? -> 객체지향(중복 제거 지향)??
        // 자바의 보완 방식은?? super()??

    public MyB() {}

    MyB(int x) {
        super(x);  // MyA(int x) 호출
    }
}


public class ExtendsEx {
    public static void main(String[] args) {
        // MyA 클래스를 객체화
//        MyA a = new MyA();
        MyA a = new MyA(5); // 생성자 오버로딩(?) 된 정수 받는 생성자로 객체 생성
        System.out.println(a.x); // 10
        a.printX();

        // MyA가 상속된 MyB 클래스를 객체화
        MyB b = new MyB();
        System.out.println(b.x); // 멤버변수가 상속을 잘 받았나 확인

        MyB bb = new MyB(15);   // 생성자 상속이 안됨...... 생성자 이름이 클래스 이름과 같지 않음 -> super(x)???
        System.out.println(bb.x);

        b.x = 20;                // 수정
        b.printX();              // 메서드가 상속 & 수정이 반영됐는지 확인
    }
}