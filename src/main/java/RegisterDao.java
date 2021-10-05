
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDao {

	
	private String dburl="jdbc:mysql://127.0.0.1:3306/employees";
	private String dbuname="root";
	private String password="";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	public void loadDriver( String dbDriver) {
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			connection=DriverManager.getConnection(dburl,dbuname,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public String insert(MemberBeans member) {
		loadDriver(dbDriver);
		Connection connection = getConnection();
		String result="data entered successfully";
		String sqlString ="insert into employees.member values(?,?,?,?)";
		try {
			PreparedStatement pStatement=connection.prepareStatement(sqlString);
				pStatement.setString(1,member.getUsername());
				pStatement.setString(2,member.getPassword());
				pStatement.setString(3,member.getEmail());
				pStatement.setString(4,member.getContact());
				pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			result="data not entered";
		}
		return result;
	}
	
}
