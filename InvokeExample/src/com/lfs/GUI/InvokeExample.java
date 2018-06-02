package com.lfs.GUI;

import com.lfs.GUI.InvokeExample.1;
import com.lfs.GUI.InvokeExample.2;
import com.lfs.GUI.InvokeExample.3;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InvokeExample {
	private static JButton good = new JButton("Good");
	private static JButton bad = new JButton("Bad");
	private static JButton bad2 = new JButton("Bad2");
	private static JLabel resultLabel = new JLabel("Ready", 0);

	public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(3);
      JPanel p = new JPanel();
      p.setOpaque(true);
      p.setLayout(new FlowLayout());
      p.add(good);
      p.add(bad);
      p.add(bad2);
      Container c = f.getContentPane();
      c.setLayout(new BorderLayout());
      c.add(p, "Center");
      c.add(resultLabel, "South");
      good.addActionListener(new 1());
      bad.addActionListener(new 2());
      bad2.addActionListener(new 3());
      f.setSize(300, 100);
      f.setVisible(true);
   }

	static void setEnabled(boolean b) {
		good.setEnabled(b);
		bad.setEnabled(b);
		bad2.setEnabled(b);
	}
}