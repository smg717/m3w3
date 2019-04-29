package com.kh.project.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class Start extends JPanel{

	private MainFrame mf;
	   private JPanel start;
	   private JLabel label;
	   private JButton btn;
	   
	   JScrollPane scrollPane;

	   ImageIcon icon;
	   
	   public Start(MainFrame mf) {
	     
	      this.mf = mf;
	      this.start = this;
	      Image icon = new ImageIcon("images/0.PNG").getImage().getScaledInstance(1024, 768, 0); //이미지 사이즈
			
			JLabel label = new JLabel(new ImageIcon(icon));
			JButton btn = new JButton("시작");
			btn.setBounds(450, 400, 200, 100);
			btn.setBackground(Color.white);
			btn.setBorderPainted(false);
			btn.setOpaque(false);
			start.add(btn);
			mf.add(btn);

	      start.add(btn); 
	      mf.add(btn);
	      
	      start.add(label, "Center");
	      mf.add(start);

	      mf.add(this);
	      mf.setVisible(true);
	      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      btn.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            Changepanel.changepanel(mf,start, new Opening(mf));
	            mf.remove(btn);

	         }
	      });
	   }
	}