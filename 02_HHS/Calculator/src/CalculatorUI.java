import javax.swing.*;
import java.awt.*;

// 계산기 화면 구현 클래스
public class CalculatorUI {
    JFrame f;   // 초기화는 아래 생성자에서
    JButton b;  // 초기화는 아래 생성자에서
    JTextField jtf; // 한줄 입력창

    // 생성자에서 바로 호출되도록
    public CalculatorUI() {

        // 생성자의 가장 큰 목적 "멤버변수 초기화"
        f = new JFrame();
        b = new JButton("누르면 50000원");
        jtf = new JTextField(10);

        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        f.add(jtf);
        f.add(b);
        f.setSize(500, 800); // 프레임 크기 설정
        f.setLocation(500, 500); // 프레임 위치 설정
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 활성화 (창 닫기 -> 프로그램 종료)
        f.setVisible(true);
    }
}
