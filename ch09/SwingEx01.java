package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx01 extends JFrame {

	public SwingEx01() {
		// JFrame 의 기본 패널에 접근하기
		Container contentPane = getContentPane();
		// JFrame 의 기본 패널은 BorderLayout → FlowLayout
		contentPane.setLayout(new FlowLayout());
		// 기본 패널에 버튼 그리기
		contentPane.add(new JButton("첫번쨰 버튼"));
		// 제목 그리기
		setTitle("300x300 스윙 프레임 만들기");
		// 크기 300, 300 으로 그리기
		setSize(300, 300);
		// 화면에 보이게 하기
		setVisible(true); // painting (이 때 그림이 그려짐)
	}

	public static void main(String[] args) {
		new SwingEx01();
	}

}
