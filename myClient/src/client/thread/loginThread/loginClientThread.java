package client.thread.loginThread;

import java.net.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import common.message.*;
import Windows_MainInterface.MainInterface;

public class loginClientThread extends Thread
{
	final int mPort = 10000;
	public int mChanged;
	public login_message mLoginInfo;
	Socket mClient;
	
	public loginClientThread(login_message pLoginMess)
	{
		super();
		mLoginInfo = new login_message(pLoginMess);
		try{
			mClient = new Socket(MainInterface.mIp, mPort);
			mChanged = 0;
			start();
		}
		catch(Exception e)
		{}
		
	}
	
	public void run()
	{
		
	}

}
