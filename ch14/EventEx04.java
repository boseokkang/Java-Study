package ch14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx04 extends JFrame {

	private JLabel la;

	public EventEx04() {
		la = new JLabel("Hello");
		setTitle("MouseEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �̺�Ʈ �й� ������ ����
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null); // absolute ���̾ƿ�
		la.setSize(50, 20); // ���� ������
		la.setLocation(30, 30); // ���� ��ġ
		c.add(la);
		setSize(250, 250);
		setVisible(true); // paint()
	}

	class MyMouseListener extends MouseAdapter {

		// ���콺�� Ŭ���ϰ� ���� ��
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // x ��ǥ - �ȼ�
			int y = e.getY(); // y ��ǥ - �ȼ�
			la.setLocation(x, y); // �� ��ġ ���� �� repainter
		}

	}

	public static void main(String[] args) {
		new EventEx04();
	}

}
