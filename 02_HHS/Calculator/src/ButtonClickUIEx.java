import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 클릭에 대한 처리
// 1. 버튼 클릭을 지속적으로 감시함
// 1.1 Listener (감시자) 를 만들어 버튼 클릭을 감시
// 2. 버튼 클릭 시에 우리가 원하는 코드를 실행
// 2.1 Listener 에 버튼이 클릭되었을때 실행할 코드를 구현

// ActionListener: 버튼 클릭, "Enter" 입력을 감시할 수 있는 기능을 가지고 있음

// 버튼 클릭을 감시해줄 Listener
class MyListener implements ActionListener {
    JButton b;
    int count; // 버튼이 클릭 될 때 마다 클릭횟수 누적
    public MyListener( JButton x ) {
        b = x;
    }

    // 콜백 메소드(callback method)
    public void actionPerformed(ActionEvent e) {   // 버튼이 클릭되었을 때 호출되는 메서드
        System.out.println( "아 줴이줴이야" );
        count++; // 버튼이 클릭 될 때 마다 1증가
        // 버튼 이름 값 바꾸기
        b.setText("" + count);
    }
}

class ButtonUI {
    JFrame jf;
    JButton b;

    public ButtonUI() {
        jf = new JFrame("타이틀 명");
        b = new JButton("눌러라!");
        b.setText("버튼 이름 변경하기");

        // 버튼클릭 감시 기능을 가지고 있는 감시자 객체화
        MyListener m = new MyListener( b );
        // 누구를 감시할지 지정
        b.addActionListener( m ); // 버튼에 감시자 달아주기

        jf.add(b); // 판떼기 버튼 추가

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제종료 기능 활성화
        jf.setLocation(250,250);
        jf.setSize(300,300);
        jf.setVisible(true); // 화면에 판떼기 보여주기
    }
}

public class ButtonClickUIEx {
    // callback method
    public static void main(String[] args) {
        new ButtonUI();
    }
}
