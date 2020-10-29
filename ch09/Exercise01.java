package ch09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise01 extends JFrame{

	public Exercise01() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("0"));
	
	}
	public static void main(String[] args) {

		
	}

}
