package ch14;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventEx06 extends JFrame {

	int imgX = 200; // ���� heap ���� ����
	int imgY = 50;

	public EventEx06() {
		setTitle("��ǳ ����");
		setSize(700, 300);
		setLocationRelativeTo(null); // �������� ȭ�� ��� ��ġ
		setContentPane(new MyPanel()); // JFrame �� ���� �гο� ���� X �� ���� ���� ���������� ����
		setVisible(true);
	}

	// paintComponeent �Լ��� Frame �ȿ��� �۵����� �ʴ´�.
	class MyPanel extends JPanel {

		public MyPanel() {
			setFocusable(true);
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("keycode : " + e.getKeyCode());
					System.out.println("keychar : " + e.getKeyChar());
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: // 0x25 ���� Ű�� Ŭ���� ��
						imgX = imgX - 10;
						break;
					case KeyEvent.VK_RIGHT: // 0x27
						imgX = imgX + 10;
						break;
					case KeyEvent.VK_SPACE: // 0x20
						new Thread(new Runnable() {

							@Override
							public void run() {
								int time = 20;
								while (time > 0) {
									imgX = imgX + 10;
									time--;
									try {
										Thread.sleep(100);
									} catch (Exception e1) {
										e1.printStackTrace();
									}
									repaint();
								}
							}
						}).start();

						break;

					}
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			ImageIcon imgBear = new ImageIcon("img/poong.png"); // �̹��� ������ ��ü
			ImageIcon imgPa = new ImageIcon("img/pa.png"); // �̹��� ������ ��ü

			// �̹��� ����
			Image poong = imgBear.getImage(); 
			Image pa = imgPa.getImage();

			g.drawImage(poong, 0, 0, null);
			g.drawImage(pa, imgX, imgY, null);

		}
	}

	public static void main(String[] args) {
		new EventEx06();
	}

}
