package ch14;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventEx06 extends JFrame {

	int imgX = 200; // 전역 heap 으로 관리
	int imgY = 50;

	public EventEx06() {
		setTitle("장풍 예제");
		setSize(700, 300);
		setLocationRelativeTo(null); // 프레임이 화면 가운데 배치
		setContentPane(new MyPanel()); // JFrame 이 가진 패널에 접근 X → 내가 만든 프레임으로 변경
		setVisible(true);
	}

	// paintComponeent 함수는 Frame 안에서 작동하지 않는다.
	class MyPanel extends JPanel {

		public MyPanel() {
			setFocusable(true);
			this.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("keycode : " + e.getKeyCode());
					System.out.println("keychar : " + e.getKeyChar());
					switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: // 0x25 왼쪽 키를 클릭할 때
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

			ImageIcon imgBear = new ImageIcon("img/poong.png"); // 이미지 아이콘 객체
			ImageIcon imgPa = new ImageIcon("img/pa.png"); // 이미지 아이콘 객체

			// 이미지 추출
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
