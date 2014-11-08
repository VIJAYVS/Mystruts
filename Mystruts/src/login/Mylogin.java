package login;
import java.sql.*;

import com.opensymphony.xwork2.ActionSupport;
public class Mylogin extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username,password;

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String execute()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from empdetails where usern='"+username+"' and passw='"+password+"'");
		if(rs.next())
		{
			return "success";
		}
		else
		{
			return "failure";
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "failure";
	}
	public void validate()
	   {
	      if (username == null || username.trim().equals(""))
	      {
	         addFieldError("username","Please enter username and password");
	      }
	      else
	      {
	      if (password==null || password.trim().equals(""))
	      {
	         addFieldError("password","Please enter your Password Mr."+username);
	      }
	      }
	   }
}
