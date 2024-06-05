package J17_part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;
public class j17_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s=new Scanner(System.in);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("class register");
				Connection a=DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root","Aravind@2002");
				System.out.println("success");
				System.out.println("enter a range from");
	            String c=s.next();	
	            System.out.println("enter a range to");
	            String b=s.next();	
	            
	            String d="select*from sameer where salrey between "+c+" and "+b;
	            Statement st=a.createStatement();
	            ResultSet rs= st.executeQuery(d);
	            while(rs.next())
	            {
	            	System.out.println(rs.getString("firstname")+"\t"+rs.getDate("doj")+"\t"+rs.getString("dept")+"\t"+rs.getInt("salrey"));
	            }
				}
				catch(ClassNotFoundException|SQLException e){
					System.out.println(e);
				}
	}

}
