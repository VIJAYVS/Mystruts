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
			 static final String classname="com.mysql.jdbc.Driver";
			 static final String url="jdbc:mysql://localhost:3306/Employee";
			 static final String username="root";
			 static final String password="root";
		Class.forName(classname);
		Connection con=DriverManager.getConnection(url,username,password);
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
			return "failure";
			System.out.println(e);
		}
		return "success";
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
