package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx extends JFrame {

	private MyPanel panel = new MyPanel();

	public paintJPanelEx() {
		setTitle("JPanel 의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // 생성한 panel 패널을 컨텐트팬으로 사용
		setSize(250, 220);
		setVisible(true);
	}

	// JPanel 을 상속받는 새 패널 구현
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 패널 내에 이전에 그려진 잔상을 지우기 위해 호출
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(10, 10, 50, 50); // (10,10) 위치에 50x50 크기의 사각형 그리기
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}

	public static void main(String[] args) {
		new paintJPanelEx();
	}

}
