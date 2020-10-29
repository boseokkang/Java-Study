package ch14;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {

	private JLabel la = new JLabel("No Mouse Event"); // 메시지 출력 레이블 컴포넌트

	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener(); // 리스너 객체 생성
		c.addMouseListener(listener); // MouseListener 리스너 등록
		c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록
		// MyMouseListener 를 Mouse 리스너와 MouseMotion 리스너로 따로 등록하여야 한다.

		c.add(la);
		setSize(300, 200);
		setVisible(true);

	}

	// Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 작성
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener 의 5개 메소드 구현
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + "," + e.getY() + ")");
			// 마우스가 눌러진 위치 (x, y) 점을 출력

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")");
			// 마우스가 떼어진 위치 (x, y) 점을 출력
		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource(); // 마우스 올라간 컴포넌트 알아냄
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource(); // 마우스가 내려간 컴포넌트 알아냄
			c.setBackground(Color.YELLOW);

		}

		// MouseMotionListener 의 2개 메소드 구현
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
			// 마우스가 드래깅되는 동안 계속 호출
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
			// 마우스가 움직이는 동안 계속 호출
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
