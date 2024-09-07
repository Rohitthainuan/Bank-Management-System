package Bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class ConnectionFectory
{
	Connection con;
	Statement stmt;
	
	public ConnectionFectory()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","mysql");
			stmt=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
