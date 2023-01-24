package MAVEN_PROJECT.RestDemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	Connection con = null;
	
	public AlienRepository() {
		
		String url = "jdbc:mysql://localhost:3306/login";
		String uname = "root";
		String pwd = "Yashu@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//to get list of aliens
	public List<Alien> getAliens() throws SQLException{
		List<Alien> aliens = new ArrayList<>();
		String sql = "select * from restdb";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			Alien a = new Alien();
			a.setID(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPoints(rs.getInt(3));
			aliens.add(a);
		}
		return aliens;
	}
	
	//to get a particular alien by ID
	public Alien getAlien(int id) throws SQLException {
		
		String sql = "select * from restdb where id="+id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Alien a = new Alien();
		
		if(rs.next()) {
			a.setID(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPoints(rs.getInt(3));
		}
		return a;
	}
	public void create(Alien a) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into restdb values (?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,a.getID());
		st.setString(2,a.getName());
		st.setInt(3,a.getPoints());
		st.executeUpdate();

	}

	public void update(Alien a) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update restdb set name=?, points=? where id=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(3,a.getID());
		st.setString(1,a.getName());
		st.setInt(2,a.getPoints());
		st.executeUpdate();
	}
	
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from restdb where id=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,id);
		st.executeUpdate();
	}
	
}
