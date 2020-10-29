package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		BorderLayout border = new BorderLayout();
		c.setLayout(border);

		// 문자열 레이블 생성
		JLabel textLabel = new JLabel("사랑합니다.");

		// 이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("img/beauty.jpg"); // 이미지 로딩
		JLabel imageLabel = new JLabel(beauty); // 이미지 레이블 생성

		// 문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("img/normalIcon.gif"); // 이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER); // 레이블 생성

		// 컨텐트팬에 3개의 레이블 부착
//		c.add(textLabel, border.NORTH);
		c.add(imageLabel, border.CENTER);
		c.add(label, border.SOUTH);
		JButton btn = new JButton("클릭");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				beauty.setImage(normalIcon.getImage());
				repaint();
			}
		});
		c.add(btn, border.NORTH);
		setSize(400, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
