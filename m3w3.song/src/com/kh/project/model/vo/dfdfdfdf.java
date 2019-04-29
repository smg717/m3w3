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
		
			
		//상단 메인 이미지

		JPanel panel1= new JPanel();
		panel1.setSize(400, 300);
		panel1.setLocation(0, 0);
		panel1.setBackground(color);

		
		

		//중간 로그인창

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

		
		//하단 버튼
		
		JButton button1 = new JButton("로그인");
		JButton button2 = new JButton("ID/PWD 찾기");
		JButton button3 = new JButton("회원가입");

		button1.setSize(120,50);
		button1.setLocation(60, 170);
		button2.setSize(120,50);
		button2.setLocation(220, 170);
		button3.setSize(280,50);
		button3.setLocation(60,250);
		
		//아이디와 비밀번호를 받을 변수 선언
		button1.addActionListener(new ActionListener() {
			
			String id, pwd;
			//로그인 버튼 클릭 시 액션리스너
			@Override
			public void actionPerformed(ActionEvent e) {
				//JTextField에 입력한 id받아오기
				id = new String(tf.getText());
				//JPasswordField에 입력한 password받아오기
				pwd = new String(password.getPassword());
				LoginCheck lc = new LoginCheck();
				
				//id와 password를 loginCheck메소드로 확인하여 결과값에 따라 창 변경or팝업창 출력
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
