import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {
	
	String dburl="jdbc:mysql://localhost/studentdb";
	String dbuser="root";
	String dbpwd="";
	String dbdriver="com.mysql.cj.jdbc.Driver";
	Connection con = null;
	
	//for loading the driver
	public void loadDriver() {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//for creating a db connection
	public Connection getCon() {
		
		try {
			con=DriverManager.getConnection(dburl,dbuser,dbpwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	//Insert data into db
	public String addUser(User user1) {
		
		loadDriver();
		Connection cnx =getCon();
		
		String sql="INSERT INTO signup(Name,Email,Username,Usertype,Password) VALUES (?,?,?,?,?)";
		String message="User Created successfully";
		try {
			PreparedStatement st= cnx.prepareStatement(sql);
			st.setString(1,user1.getName());
			st.setString(2,user1.getEmail());
			st.setString(3,user1.getUsername());
			st.setString(4,user1.getUsertype());
			st.setString(5,user1.getPassword());
			
			st.executeUpdate();
			
			
		} catch (SQLException e) {
			 message="User not added";
			e.printStackTrace();
		}
		
		return message;
	}

}
