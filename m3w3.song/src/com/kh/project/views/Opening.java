package com.kh.project.views;

import java.awt.Button;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Opening extends JPanel{
   private MainFrame mf;
   private JPanel panel;
   private JPanel panel2;
   private Image icon;
   private Image icon8;
   private JLabel label;
   private JLabel label2;
   private Button btn;
   int a=0;
   private JPanel opening;
   
   public Opening(MainFrame mf) {
      panel = new JPanel();
      panel2 = new JPanel();
      this.opening = this;
      this.mf=mf;
      icon8 = new ImageIcon("images/방.PNG").getImage()
      .getScaledInstance(1024, 768, 0);
      icon = new ImageIcon("images/"+a+".PNG").getImage()
            .getScaledInstance(1024, 768, 0); //이미지 사이즈
      label2 = new JLabel(new ImageIcon(icon8));
      label = new JLabel(new ImageIcon(icon));
      btn = new Button(">>");
      btn.setBounds(900, 600, 50, 50);
      btn.addActionListener(new MyEvent());
      
      panel.add(btn);
      mf.add("South",btn);
      
      panel2.add(label2);
      mf.add(panel2);
      panel.add(label, "Center");
      mf.add("South",panel);
      
      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   class MyEvent implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e) {
         if(e.getSource()==btn) {
            a++;
            Image icon = new ImageIcon("images/"+a+".PNG")
                  .getImage()
                  .getScaledInstance(1024, 200, 0);
            label.setIcon(new ImageIcon(icon));
            if(a==3) {
               a++;
               Image icon2 = new ImageIcon("images/"+a+".PNG")
                     .getImage()
                     .getScaledInstance(1024, 200, 0);
               label.setIcon(new ImageIcon(icon));
            }
            if(a==4) {
               Image icon3 = new ImageIcon("images/"+a+".PNG")
                     .getImage()
                     .getScaledInstance(1024, 200, 0);
               label.setIcon(new ImageIcon(icon));
            }
            if(a==5) {
               Image icon3 = new ImageIcon("images/"+a+".PNG")
                     .getImage()
                     .getScaledInstance(1024, 200, 0);
               label.setIcon(new ImageIcon(icon));
               btn.addActionListener(new ActionListener() {
            	   
            	   @Override
            	   public void actionPerformed(ActionEvent e) {
            		   Changepanel.changepanel(mf,opening, new Stage1(mf));
            	   }
               });
            }
            /*if(a==6) {
               Image icon3 = new ImageIcon("images/"+a+".PNG")
                     .getImage()
                     .getScaledInstance(1024, 200, 0);
               label.setIcon(new ImageIcon(icon));
               
               
            }*/
         }

      }
   }
   
}