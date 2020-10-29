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

	private JLabel la = new JLabel("No Mouse Event"); // �޽��� ��� ���̺� ������Ʈ

	public MouseListenerAllEx() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyMouseListener listener = new MyMouseListener(); // ������ ��ü ����
		c.addMouseListener(listener); // MouseListener ������ ���
		c.addMouseMotionListener(listener); // MouseMotionListener ������ ���
		// MyMouseListener �� Mouse �����ʿ� MouseMotion �����ʷ� ���� ����Ͽ��� �Ѵ�.

		c.add(la);
		setSize(300, 200);
		setVisible(true);

	}

	// Mouse �����ʿ� MouseMotion �����ʸ� ��� ���� ������ �ۼ�
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener �� 5�� �޼ҵ� ����
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + "," + e.getY() + ")");
			// ���콺�� ������ ��ġ (x, y) ���� ���

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased (" + e.getX() + "," + e.getY() + ")");
			// ���콺�� ������ ��ġ (x, y) ���� ���
		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource(); // ���콺 �ö� ������Ʈ �˾Ƴ�
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource(); // ���콺�� ������ ������Ʈ �˾Ƴ�
			c.setBackground(Color.YELLOW);

		}

		// MouseMotionListener �� 2�� �޼ҵ� ����
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
			// ���콺�� �巡��Ǵ� ���� ��� ȣ��
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
			// ���콺�� �����̴� ���� ��� ȣ��
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
