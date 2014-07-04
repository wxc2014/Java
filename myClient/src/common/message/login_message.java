package common.message;

import java.io.Serializable;

public class login_message implements Serializable
{
	private static final long serialVersionUID = 1L;
	public String qqAccount = "";
	public String  password = "";
	
	public login_message(String pQqAccount, String pPassword)
	{
		qqAccount = pQqAccount;
		password = pPassword;
	}
	
	public login_message( login_message pLoginInfo)
	{
		qqAccount = pLoginInfo.qqAccount;
		password = pLoginInfo.password;
	}
	
}
