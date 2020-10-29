package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx01 extends JFrame {

	public EventEx01() {
		setTitle("Action �̺�Ʈ ������ ����");
		// X ��ư Ŭ���� �̺�Ʈ �й� ������ ���� = ��� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		// ������ ����
		btn.addActionListener(new MyActionListener());

		c.add(btn);
		setSize(350, 150);
		setVisible(true); // paint() ȣ��
	}

	

	public static void main(String[] args) {
		new EventEx01();
	}

}

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Action")) {
			b.setText("�׼�");
		} else {
			b.setText("Action");
		}

	}
}

