package com.kh.project.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
   {
      this.setSize(1024, 768);
//      this.setBounds(0,0,1024,768);
//      this.add(new Opening());
      
      new Start(this);
     // new Opening(this);
      this.setTitle("食切実 害切実");
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }


}