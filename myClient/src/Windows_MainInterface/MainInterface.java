package Windows_MainInterface;

import javax.swing.JFrame;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

import common.message.*;


public class MainInterface extends JFrame implements ActionListener
{
	private static final long	serialVersionUID	= 1L;
	login_message				mLoginInfo			= null;
	JFrame						mLoginJframe;
	
	
	public MainInterface(login_message pLoginInfo)
	{
		mLoginInfo = pLoginInfo;
		
		mLoginJframe = new JFrame();
		Toolkit tk = getToolkit();
		Dimension dm = tk.getScreenSize();
	}
}
