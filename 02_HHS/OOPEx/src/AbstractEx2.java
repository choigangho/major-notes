// 추상화 메소드 언제 쓰냐?
// 아래와 같이 상위 개념의 클래스에서 특정 기능을 구현하다보면
// 해당 기능을 가지는 건 맞지만 기능 구현이 불가능? 한 경우가 생김. 그때 추상화 메소드 사용
// >>> cry() 기능 가지나 구체적 기능 구현은 하위 클래스에서 해야하기 때문에? 추상 클래스에 메소드 선언만 한다는 느낌 변수 선언만하고 값은 나중에 넣는 느낌??
abstract class Animal {
    abstract public void cry();
}

// 위 예제처럼 추상화 메소드를 사용하면 개발과정에서
// 무슨 장점?이 있나?
// 추상화 메소드를 상속받은 하위 클래스에서는 추상화 메소드 구현이 강제됨 -> 메소드 일관성
class Pig extends Animal {
    @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("야옹");
    }
}


public class AbstractEx2 {
    public static void main(String[] args) {
        Animal p =                                                                                                                              new Pig();
        Animal d =                                                                                                                              new Dog();
        Animal c =                                                                                                                              new Cat();

        // 다향성
        p.cry();
        d.cry();
        c.cry();
    }
}
