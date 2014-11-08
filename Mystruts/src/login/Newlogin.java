package login;

import java.sql.Connection;
import java.sql.DriverManager;
import com.opensymphony.xwork2.ActionSupport;

public class Newlogin extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String newuser,anewpass;
	public int s=0;
	

	public String getNewuser() {
		return newuser;
	}

	public void setNewuser(String newuser) {
		this.newuser = newuser;
	}
	public String getAnewpass() {
		return anewpass;
	}

	public void setAnewpass(String anewpass) {
		this.anewpass = anewpass;
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
	java.sql.PreparedStatement ps=con.prepareStatement("insert into empdetails(usern,passw) values(?,?)");
	ps.setString(1,"newuser");
	ps.setString(2,"anewpass");
	s=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "addsuccess";
	}
	
}


