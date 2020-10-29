package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx02 extends JFrame implements ActionListener {

	EventEx02 ex02;
	
	public EventEx02() {
		setTitle("Action 이벤트 리스너 예제");
		// X 버튼 클릭시 이벤트 분배 스레드 종료 = 모든 스레드 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		// 리스너 생성
		btn.addActionListener(this);

		c.add(btn);
		setSize(350, 150);
		setVisible(true); // paint() 호출
	}

	public static void main(String[] args) {
		new EventEx02();
	}
	// 타겟 (EventEx02 가 가지고 있음)
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭됨");
		
	}

}
