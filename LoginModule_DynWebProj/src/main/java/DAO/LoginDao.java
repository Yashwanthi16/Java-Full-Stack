package DAO;

import java.sql.*;

public class LoginDao {

	//first download mysql connector jar file from maven repository on web 
	//and the paste it in lib folder or we can convert this dynamic web project t maven project as well!!
	//for conversion: rightclick on project> configure > convert to maven project
	//for now we have only used the dynamic web project and pasted jar in lib folder
	//we need to add that in build path: right clicjk project> properties> java build path >add jars
	
	String url = "jdbc:mysql://localhost:3306/login";
	//here login is my database name
	String query = "select * from login.userdirectory where uname = ? and password = ?";
	//if there is an entry with this uname and pwd it returns sth
	
	public boolean check(String uname, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "Yashu@123");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname); //setting first ? as uname 
			st.setString(2, password); //setting second ? as password
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true; //it means he is a valid user
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
}
