package Windows_login;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.*;


public class login extends JFrame {

	private static final long	serialVersionUID = 1L;
	private Dimension 	screenSize;
	private JLabel		jl_logo;
	private JLabel		jl_user;
	private JLabel		jl_apply;
	private JLabel		jl_password;
	private JLabel		jl_remember;
	private JLabel		jl_status;
	private JPanel		jp_login;
	private JTextField	jt_user;
	private JPasswordField	jp_password;
	private JComboBox		jco_status;
	private JCheckBox		jch_remember;
	private JCheckBox		jch_login;
	private JButton			jb_login;
	
	public login(){
		Image image = Toolkit.getDefaultToolkit().getImage("pic//headpic.jpg");
		setIconImage(image);
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation( screenSize.width/3, screenSize.height/3 );
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		jl_logo = new JLabel();
		jl_logo.setIcon(new ImageIcon("pic/logo.gif"));
		c.add(jl_logo, BorderLayout.NORTH);
		
		jp_login = new JPanel();
		jp_login.setLayout(null);
		
		//��½
		jl_user = new JLabel();
		jl_user.setText("QQ�˺�");
		jl_user.setBounds(10, 30, 50, 20);
		jl_user.setFont( new Font("����", Font.PLAIN, 12) );
		jp_login.add(jl_user);
		//��½��
		jt_user = new JTextField();
		jt_user.setHorizontalAlignment(JTextField.LEFT);
		jt_user.setBounds(70, 30, 160, 20);
		jp_login.add(jt_user);
		
		jl_apply = new JLabel();
		jl_apply.setText("�����˺�");
		jl_apply.setFont( new Font("����", Font.PLAIN, 12) );
		jl_apply.setBounds(250, 30, 80, 20);
		jl_apply.setForeground(Color.blue);
		jp_login.add(jl_apply);
		
		jl_password = new JLabel();
		jl_password.setText("QQ����");
		jl_password.setFont( new Font("����", Font.PLAIN, 12) );
		jl_password.setBounds(10, 60, 50, 20);
		jp_login.add(jl_password);
		
		jp_password = new JPasswordField();
		jp_password.setHorizontalAlignment(JTextField.LEFT);
		jp_password.setBounds(70, 60, 160, 20);
		jp_login.add(jp_password);
		
//		jp_password.addKeyListener( new KeyAdapter(){
//			public void keyPressed(KeyEvent e){
//				if(e.getKeyCode() == KeyEvent.VK_ENTER){
//					try{
//						
//					}
//					catch( Exception e1){
//						
//					}
//				}
//			}
//		} );
		
		jl_remember = new JLabel();
		jl_remember.setText("��������");
		jl_remember.setFont( new Font("����", Font.PLAIN, 12) );
		jl_remember.setBounds(250, 60, 80, 20);
		jl_remember.setForeground(Color.blue);
		jp_login.add(jl_remember);
		
		jl_status = new JLabel();
		jl_status.setText("״̬��");
		jl_status.setBounds(40, 110, 40, 20);
		jl_status.setFont( new Font("����", Font.PLAIN, 12) );
		jl_status.setForeground(Color.black);
		jp_login.add(jl_status);
		
		jco_status = new JComboBox();
		jco_status.addItem("����");
		jco_status.addItem("����");
		jco_status.addItem("æµ");
		jco_status.addItem("�뿪");
		jco_status.setFont( new Font("����", Font.PLAIN, 13) );
		jco_status.setBounds(80, 110, 60, 20);
		jp_login.add(jco_status);
		
		jch_remember = new JCheckBox();
		jch_remember.setText("��ס����");
		jch_remember.setBounds(145, 110, 80, 20);
		jch_remember.setFont( new Font("����", Font.PLAIN, 13) );
		jp_login.add(jch_remember);
		
		jch_login = new JCheckBox();
		jch_login.setText("�Զ���½");
		jch_login.setFont( new Font("����", Font.PLAIN, 13) );
		jch_login.setBounds(230, 110, 80, 20);
		jp_login.add(jch_login);
		
		jb_login = new JButton();
		jb_login.setIcon( new ImageIcon("pic/login.gif") );
		jb_login.setBounds(240, 140, 65, 20);
		jp_login.add(jb_login);
		
		jb_login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					loginActionPerformed(e);
				}
				catch( Exception e1){
					
				}
			}
		} );
		
		c.add(jp_login, BorderLayout.CENTER);
		
		setResizable(false);
		setSize(348, 250);
		setVisible(true);
		setTitle("My QQ");
	}
	
	protected void processWindowEvent(WindowEvent e){
		if(e.getID() == WindowEvent.WINDOW_CLOSING){
			System.exit(0);
		}
		else{
			super.processWindowEvent(e);
		}
	}
	
	private void loginActionPerformed(ActionEvent e) throws UnknownHostException, IOException, InterruptedException
	{
		if( jt_user.getText().equals("") ){
			JOptionPane.showMessageDialog(null, "�������û������ٵ�½", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
		}
		else if( jt_user.getText().length() < 6 || jt_user.getText().length() > 20 )
		{
			JOptionPane.showMessageDialog(null, "��������ȷ���û���", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
		}
		else if( Arrays.equals( jp_password.getPassword(), "".toCharArray()) )
		{
			JOptionPane.showMessageDialog(null, "������������ٵ�½", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			//��½�ĵ��ýӿ�,�Ժ�ʵ��
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		login application = new login();
	}
}
