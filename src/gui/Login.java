package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener{

	JFrame mainJFrame;
	Container con;
	JLabel labName,labPass,labTitle,labEmpty;
	JTextField txtName;
	JPasswordField txtPass;
	JButton login1,register,cancel;
	

public Login(){
	mainJFrame=new JFrame("�û���¼");
	con=mainJFrame.getContentPane();
	con.setLayout(new FlowLayout());
	labTitle=new JLabel("<html><body><h1> ��ӭʹ��ɨ�� \n <br> </h1> </body>  </html>");
	
	
	labName=new JLabel("  �û���:");
	txtName=new JTextField();
	txtName.setColumns(20);
	
	labPass=new JLabel("    ����:  ");
	txtPass=new JPasswordField();
	txtPass.setColumns(20);
	
	login1=new JButton("��¼");
	login1.addActionListener(this);
	
	register=new JButton("ע��");
	register.addActionListener(this);
	
	cancel=new JButton("ȡ��");
	cancel.addActionListener(this);
	
	
	con.add(labTitle);
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(labName);
	con.add(txtName);
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(labPass);
	con.add(txtPass);
	con.add(Box.createHorizontalStrut(30000));
	
	con.add(login1);
	con.add(register);
	con.add(cancel);
	
	mainJFrame.setSize(350, 350);
	mainJFrame.setVisible(true);
	mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==login1){
		
	}
	if(e.getSource()==register){
		mainJFrame.setVisible(false);
		Registry reg=new Registry();
		reg.mainJFrame.setVisible(true);
	}
	if(e.getSource()==cancel){
		txtName.setText(null);
		txtPass.setText(null);
		
	}
}
public static void main(String[] args){
	new Login();
  }
}