package smsprogram;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SmsMain extends JFrame {

	private static JLabel label;
	private static JTextField text;
	private static JTextArea area;
	private static JButton bt;
	
	public SmsMain() {
		setTitle("SMS 전송 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		label = new JLabel("보내는 번호");
		
						
		bt = new JButton("전송");
		c.add(bt);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SmsMain();
	}

}
