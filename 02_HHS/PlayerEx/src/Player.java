abstract class Player {
    boolean pause;      // 일시정지 상태를 저장하기 위한 변수
    int currentPos;     // 현재 Play되고 있는 위치를 저장하기 위한 변수

    Player(); {         // 추상 클래스도 생성자가 있어야 한다.
        pause = false;
        currentPos = 0;
    }
}
