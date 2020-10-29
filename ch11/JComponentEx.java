package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {

	// stack(생성자 안)으로 관리하면 나중에 찾을 수가 없기 때문에 heap으로 관리
	private JButton b1, b2, b3;

	public JComponentEx() {
		setTitle("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		b1 = new JButton("Magenta/Yellow Button");
		b2 = new JButton("   Disabled Button   ");
		b3 = new JButton("getX(), getY()");

		b1.setBackground(Color.YELLOW); // 백그라운드
		b2.setForeground(Color.MAGENTA); // 포그라운드
		b3.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false); // 버튼 비활성화

		b3.addActionListener(new ActionListener() {

			// 타겟 (콜백되는)
			@Override
			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton) e.getSource(); 
				// ↑ Object(뭐가 들어올지 모름)를 리턴하기 때문에 다운캐스팅
				b3.setText("Hello");

			}
		});
		c.add(b1);
		c.add(b2);
		c.add(b3);
		setSize(260, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JComponentEx();
	}

}
