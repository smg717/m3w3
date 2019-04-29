package com.kh.project.views;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel{
private JFrame mf;
private JPanel panel;
public BackgroundPanel(JFrame mf) {
	this.mf = mf;
	this.setLayout(null);
	
	panel = this;
	
	JLabel label = new JLabel(new ImageIcon(new ImageIcon("images/¹æ.PNG").getImage().getScaledInstance(1000, 800, 0)));
//	label.setBounds(0, 0, 1000, 800);
	label.setSize(1024, 768);
	
//	JLabel start = new JLabel(new ImageIcon(new ImageIcon("images/start.PNG").getImage().getScaledInstance(200, 100, 0)));
//	start.setBounds(180, 550, 200, 100);
	
	label.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			Changepanel cp = new Changepanel();
			//t1.setDaemon(true);
//			GamePanel gp = new GamePanel(mf);
//			Timer timer = new Timer(mf,gp);
//			Thread t1 = timer;
//			t1.start();
			
			
			
//			cp.replacePanel();
		}
		
	});
	this.add(label);
//	this.add(start);
//	this.setComponentZOrder(label, 1);
	
	
}
}
