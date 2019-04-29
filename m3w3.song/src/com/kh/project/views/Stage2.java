package com.kh.project.views;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Stage2 extends JPanel{
	private JPanel stage2;
	private MainFrame mf;
	
	public Stage2(MainFrame mf) {
		this.mf = mf;
		this.stage2 = this;
		
		Button btn = new Button();
		if(true) {
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Changepanel.changepanel(mf,stage2, new Ending1(mf));
			}
		});}
		else {
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Changepanel.changepanel(mf,stage2, new Ending2(mf));
				}
			});
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7124297795662955232L;
	
}




















