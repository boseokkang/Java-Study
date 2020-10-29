package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx02 extends JFrame {

	public SwingEx02() {
		setTitle("ContentPane 과 JFrame"); // 프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 윈도우를 닫으면 프로그램 종료하도록 설정

		Container contentPane = getContentPane(); // 패널 접근
		contentPane.setBackground(Color.orange); // 패널 배경 색 오렌지
		contentPane.setLayout(new FlowLayout()); // 패널 FlowLayout

		contentPane.add(new JButton("OK")); // OK 버튼 달기
		contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
		contentPane.add(new JButton("Ignore")); // Ignore버튼 달기

		setSize(300, 150); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력

	}

	public static void main(String[] args) {
		new SwingEx02();
	}

}
