package com.kh.project.views;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.kh.project.views.Opening.MyEvent;

public class Stage1 extends JPanel{
	private JPanel stage1;
	private MainFrame mf;
	
	public Stage1(MainFrame mf) {
		this.mf = mf;
		this.stage1 = this;
		
		Button btn = new Button();
		  btn = new Button(">>");
	      btn.setBounds(900, 600, 50, 50);
	      
	      stage1.add(btn);
	      mf.add("Center",btn);
		
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Changepanel.changepanel(mf,stage1, new Stage2(mf));
			}
		});
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7124297795662955232L;
	
}











































