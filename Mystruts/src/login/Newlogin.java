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
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
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


