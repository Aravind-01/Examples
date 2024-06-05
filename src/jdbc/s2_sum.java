package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class s2_sum {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class register");
		Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","Aravind@2002");
		System.out.println("success");
			
		}
		catch(ClassNotFoundException|SQLException e){
			System.out.println(e);
		}

}
}
