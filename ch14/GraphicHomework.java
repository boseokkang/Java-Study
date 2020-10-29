package ch14;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicHomework extends JFrame {

	private MyPanel panel = new MyPanel();

	public GraphicHomework() {
		setTitle("국가별 수산물 수출입현황");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.fillRect(50, 50, 20, 140);
			g.setColor(Color.RED);
			g.fillRect(100, 50, 20, 140);

		}
	}

	public static void main(String[] args) {
		new GraphicHomework();

	}

}
