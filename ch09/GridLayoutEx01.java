package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx01 extends JFrame {

	public GridLayoutEx01() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 4x2 격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); // 격자 사이의 수직 간격을 5픽셀로 설정

		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름 "));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번 "));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과 "));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목 "));
		c.add(new JTextField(""));

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx01();
	}

}
