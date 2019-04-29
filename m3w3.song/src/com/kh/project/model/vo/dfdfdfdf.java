package com.kh.project.model.vo;

public class dfdfdfdf {


public class LoginPage extends JPanel{
	private MainFrame mf;
	private JPanel loginPage;

	public LoginPage(MainFrame mf) {
		this.mf = mf;
		this.loginPage = this;
		this.setSize(400, 700);		
		this.setLayout(null);
		Color color = new Color(234,255,236);
		
			
		//��� ���� �̹���

		JPanel panel1= new JPanel();
		panel1.setSize(400, 300);
		panel1.setLocation(0, 0);
		panel1.setBackground(color);

		
		

		//�߰� �α���â

		JPanel panel2= new JPanel();
		panel2.setSize(400, 400);
		panel2.setLocation(0, 300);
		panel2.setLayout(null);
		
		panel2.setBackground(color);
		Image login_ID = new ImageIcon("images/login_ID.png").getImage().getScaledInstance(60, 40, 0);
		JLabel label1 = new JLabel(new ImageIcon(login_ID));
		Image login_Pwd = new ImageIcon("images/login_Pwd.png").getImage().getScaledInstance(60, 40, 0);
		JLabel label2 = new JLabel(new ImageIcon(login_Pwd));
		
		JTextField tf = new JTextField(20);
		JPasswordField password = new JPasswordField(30);
		label1.setSize(60,40);
		label1.setLocation(60, 50);

		label2.setSize(60,40);
		label2.setLocation(60, 100);

		tf.setSize(220,40);
		password.setSize(220,40);

		tf.setLocation(120,50);
		password.setLocation(120, 100);

		
		//�ϴ� ��ư
		
		JButton button1 = new JButton("�α���");
		JButton button2 = new JButton("ID/PWD ã��");
		JButton button3 = new JButton("ȸ������");

		button1.setSize(120,50);
		button1.setLocation(60, 170);
		button2.setSize(120,50);
		button2.setLocation(220, 170);
		button3.setSize(280,50);
		button3.setLocation(60,250);
		
		//���̵�� ��й�ȣ�� ���� ���� ����
		button1.addActionListener(new ActionListener() {
			
			String id, pwd;
			//�α��� ��ư Ŭ�� �� �׼Ǹ�����
			@Override
			public void actionPerformed(ActionEvent e) {
				//JTextField�� �Է��� id�޾ƿ���
				id = new String(tf.getText());
				//JPasswordField�� �Է��� password�޾ƿ���
				pwd = new String(password.getPassword());
				LoginCheck lc = new LoginCheck();
				
				//id�� password�� loginCheck�޼ҵ�� Ȯ���Ͽ� ������� ���� â ����or�˾�â ���
				if(lc.loginCheck(id, pwd)) {
					ChangePanel.changePanel(mf,loginPage, new MainPage(mf));
				}else {
					
					PopUp pu = new PopUp();
					pu.loginPopUp();
					
				}
						
			}
		});
		
		
		
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, loginPage, new FindIdPage(mf));
				
			}
			
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, loginPage, new JoinPage(mf));
				
			}
		});		
		Image mobobMain = new ImageIcon("images/mobobMain.png").getImage().getScaledInstance(300, 300, 0);
		JLabel mobob = new JLabel(new ImageIcon(mobobMain));
		mobob.setLocation(50, 0);
		
		
		panel1.add(mobob);
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(tf);
		panel2.add(password);
	
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		

		this.add(panel1);
		this.add(panel2);
		


		
		mf.add(this);
		mf.setVisible(true);

	}

}

}
