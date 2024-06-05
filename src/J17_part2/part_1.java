package J17_part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class part_1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class register");
			Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root","Aravind@2002");
			System.out.println("success");
		    String q="select*from akshay";
		    Statement d=a.createStatement();
		    ResultSet rs=d.executeQuery(q);
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt("eid")+" "+rs.getString("firstname")+"\t"+rs.getString("lastname")+"\t"+rs.getDate("date_of_join"));
		    	
		    }
		    a.close();
			}
			catch(ClassNotFoundException|SQLException e){
				System.out.println(e);
			}

	}

}
