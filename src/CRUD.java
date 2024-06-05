
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
public class CRUD {
	private Connection b;
	public CRUD()throws ClassNotFoundException,SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("class register");
	b=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","Aravind@2002");
	System.out.println("success");
	}
	public void cons()throws SQLException
	{
		b.close();
	}
	/*public boolean login(String user,int pass) throws SQLException
	{
		Statement c=b.createStatement();
		ResultSet rs=c.executeQuery("select*from login_id");
		while(rs.next())
		{	
			if(rs.getString("user_name").equals(user)&&rs.getString("user_pass").equals(pass))
					{
				     return true;
					}
		}
		return false;
	}*/
	
	public int insert(int id,String name,String dep,int sal)throws SQLException
	{
		
		PreparedStatement a=b.prepareStatement("insert into arvv(id,name,dept,salrey) values(?,?,?,?)");
	    a.setInt(1,id);
	    a.setString(2,name);
	    a.setString(3,dep);
	    a.setInt(4,sal);
	    return a.executeUpdate();
	
	    
	}
	public void view()throws SQLException
	{
		
		Statement c=b.createStatement();
		ResultSet rs=c.executeQuery("select*from arvv");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("dept")+"\t"+rs.getInt("salrey"));
		}
	}
	public int update(int sal,int id)throws SQLException
	
	{
	
		PreparedStatement a=b.prepareStatement("update arvv set salrey="
				+ "? where id=?");
		a.setInt(1,sal);
		a.setInt(2,id);
		
		return a.executeUpdate();
	}
	public int delete(int id)throws SQLException
	{

	PreparedStatement a=b.prepareStatement("delete from arvv where id=?");
	a.setInt(1,id);
	return a.executeUpdate();
	}

}

