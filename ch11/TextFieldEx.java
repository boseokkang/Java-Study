package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	private JTextField tf;
	private JTextArea ta;
	private ScrollPane sp;

	public TextFieldEx() {
		init();
		setTitle("텍스트 에디터, 텍스트 박스 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		// 텍스트 필드 디자인
		tf.setFont(new Font("Arial", Font.BOLD, 30));
		tf.setPreferredSize(new Dimension(100, 100)); // x, y

		ta.setBackground(Color.ORANGE);
//		ta.setEnabled(false);
		ta.setFont(new Font("Arial", Font.BOLD, 30));
		ta.setForeground(Color.BLUE);

		sp.add(ta); // 순서 중요! text area 만들어지기 전에 구동되면 안됨

		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String value = tf.getText();
					ta.append(value + "\n");
					tf.setText("");
				}
			}
		});

		c.add(tf, BorderLayout.SOUTH);
		c.add(sp, BorderLayout.CENTER);

		setSize(400, 500);
		setVisible(true);
	}

	private void init() { 
		tf = new JTextField("", 20);
		sp = new ScrollPane();
		ta = new JTextArea("", 5, 20);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}
