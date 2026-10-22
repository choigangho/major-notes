class MyPrint {
    public static void printA() {   // 스태틱이 있으므로 클래스가 스태틱이 아니여도 호출되는 메서드?
        System.out.println( "A" );
    }
}

public class StaticEx {
    static int x = 10;

    public static void main(String[] args) {
        // main은 스태틱으로 메모리에 올라간 상태라서 (객체 없이 메모리에 올라감)
        // 아래 클래스.메서드 호출하면 메모리 메서드가 메모리에 올라가고 그래서 실행되는거임?
        MyPrint.printA();

        System.out.println( StaticEx.x );
    }
}
