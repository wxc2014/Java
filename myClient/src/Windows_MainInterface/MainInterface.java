package Windows_MainInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

import java.io.IOException;

import common.message.*;


public class MainInterface extends JFrame implements ActionListener
{
	private static final long	serialVersionUID	= 1L;
	static public String		mIp					= "192.168.1.23";
	login_message				mLoginInfo			= null;
	JFrame						mLoginJframe;
	JPanel						mLoginJpanel;
	JButton						mLoginJbutton;
	
	
	public MainInterface(login_message pLoginInfo)
	{
		mLoginInfo = pLoginInfo;
		
		mLoginJframe = new JFrame();
		Toolkit tk = getToolkit();
		Dimension dm = tk.getScreenSize();
		
		mLoginJframe = new JFrame();
		mLoginJframe.setLocation((int)(dm.getWidth() - 315), 20);
		
		mLoginJpanel = new JPanel();
		mLoginJpanel.setLayout(null);
		mLoginJpanel.setOpaque(false);
		
		mLoginJbutton = new JButton("取消");
		mLoginJbutton.setFont( new Font("黑体", Font.BOLD, 15));
		mLoginJbutton.setActionCommand("取消登陆");
		mLoginJbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(e.getActionCommand().equals("取消登陆"))
				{
					System.exit(0);
				}
			}
		});
		mLoginJbutton.setBounds(100, 300, 30, 80);
		
		mLoginJpanel.add(mLoginJbutton);
		mLoginJframe.add(mLoginJpanel);
		
		mLoginJframe.setTitle("My QQ");
		Image icon = getToolkit().getImage("pic/headpic.jpg");
		mLoginJframe.setIconImage( icon );
		mLoginJframe.setSize(295, 589);
		mLoginJframe.setMinimumSize(new Dimension(295, 450));
		mLoginJframe.setResizable(false);
		mLoginJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mLoginJframe.setVisible(true);
		
		addWindowListener( new WindowAdapter(){
			public void windowClosing( WindowEvent e)
			{
				//try{
					System.exit(0);
				//}
//				catch( InterruptedException e1)
//				{
//					
//				}
			}
		});
	}
	
	class loginFunction extends Thread
	{
		public void run()
		{
			try{
				login_message lm = new login_message(mLoginInfo);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	
}
