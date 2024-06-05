package mini_project;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
public class gym_claas {
	
	  
		private Connection b;
		public gym_claas ()throws ClassNotFoundException,SQLException
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		b=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","Aravind@2002");
		}
		public void con()throws SQLException 
		
		{
			b.close();
		}
		public boolean login(String un,String pw)throws SQLException 
		{
			Statement c=b.createStatement();
			ResultSet rs=c.executeQuery("select*from login_id");
			while(rs.next())
			{
				if(rs.getString("user_name").equals(un)&&rs.getString("user_pass").equals(pw))
				{
				return true;
				}
			}
				
			return false;
		}
		public int insert(String name,String batch,String gender,int age,String mn,String tn,int fees)throws SQLException
		{
			
			String e=("insert into gym_members(name,batch,gender,age,mob_no,trainer_name,fees)values(?,?,?,?,?,?,?)");
			PreparedStatement p=b.prepareStatement(e);

			p.setString(1,name);
			p.setString(2,batch);
			p.setString(3,gender);
			p.setInt(4,age);
			p.setString(5,mn);
			p.setString(6,tn);
			p.setInt(7,fees);
			
			return p.executeUpdate();
			
			
		}
		public void view(int n,int id)throws SQLException
		{
		Statement c=b.createStatement();
		ResultSet rs=c.executeQuery("select*from gym_members");
		while(rs.next())
		  {
		if(n==1)
		{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+
		    rs.getString("batch")+"\t"+rs.getString("gender")
			+"\t"+rs.getInt("age")+"\t"+rs.getString("mob_no")+"\t+"+rs.getString("trainer_name")+
			rs.getInt("fees"));
			
		  
		}
		else if(n==2&&rs.getInt("id")==id)
			
				{
					
					System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+
				    rs.getString("batch")+"\t"+rs.getString("gender")
					+"\t"+rs.getInt("age")+"\t"+rs.getString("mob_no")+"\t+"+rs.getString("trainer_name")+
					rs.getInt("fees"));
				}
		}
		}
		
		public int del(int id)throws SQLException
		{
			String e=("delete from gym_members where id=?");
			PreparedStatement p=b.prepareStatement(e);
		   p.setInt(1,id);
		   return p.executeUpdate();
		}
		
		public int name(String a,int id)throws SQLException
		{
			String e=("update gym_members set name=? where id=?");
			PreparedStatement p=b.prepareStatement(e);
		    p.setString(1,a);
		    p.setInt(2,id);
		    return p.executeUpdate();
		}
		public int batch(String gh,int id)throws SQLException
		{
			String e=("update gym_members set batch=? where id=?");
			PreparedStatement p=b.prepareStatement(e);
		    p.setString(1,gh);
		    p.setInt(2,id);
		   return p.executeUpdate();
		}
		public int gender(String a,int id)throws SQLException
		{
		String e=("update gym_members set gender=? where id=?");
		PreparedStatement p=b.prepareStatement(e);
	    p.setString(1,a);
	    p.setInt(2,id);
	   return p.executeUpdate();
		}
		public int age(int c,int id)throws SQLException
		{
			String e=("update gym_members set age=? where id=?");
			PreparedStatement p=b.prepareStatement(e);
		    p.setInt(1,c);
		    p.setInt(2,id);
		    return p.executeUpdate();
		}
		public int mob(String a,int id)throws SQLException
		{
		String e=("update gym_members set mob_no=? where id=?");
		PreparedStatement p=b.prepareStatement(e);
	    p.setString(1,a);
	    p.setInt(2,id);
	     return p.executeUpdate();
		}
		public int tn(String a,int id)throws SQLException
		{
		String e=("update gym_members set trainer_name=? where id=?");
		PreparedStatement p=b.prepareStatement(e);
	    p.setString(1,a);
	    p.setInt(2,id);
	    return p.executeUpdate();
		}
		public int fees(int c,int id)throws SQLException
		{
		String e=("update gym_members set fees=? where id=?");
		PreparedStatement p=b.prepareStatement(e);
	    p.setInt(1,c);
	    p.setInt(2,id);
	    return p.executeUpdate();
		}
		public void vq(int n,int id)throws SQLException
		{
			Statement s=b.createStatement();
			ResultSet rs=s.executeQuery("select*from et");
			while(rs.next())
			{
				if(n==3)
				{
					System.out.println(rs.getInt("et_id")+"\t"+rs.getString("name"));
				}
				else if(n==4&&rs.getInt("et_id")==id)
				{
					System.out.println(rs.getInt("et_id")+"\t"+rs.getString("name"));
				}
			}
		}
		public void tr()throws SQLException
		{
			Statement s=b.createStatement();
			ResultSet rs=s.executeQuery("select*from gt");
			while(rs.next())
			{
			System.out.println(rs.getInt("tr_id")+"\t"+rs.getString("name")+"\t"+rs.getString("gender")+"\t"+rs.getString("mob_num"));
			}
			
		}
		public void fees(int n)throws SQLException
		{
			Statement s=b.createStatement();
			ResultSet rs=s.executeQuery("select*from gym_members where fees>=500");
			while(rs.next())
			{
			System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+
				    rs.getString("batch")+"\t"+rs.getString("gender")
					+"\t"+rs.getInt("age")+"\t"+rs.getString("mob_no")+"\t+"+rs.getString("trainer_name")+
					rs.getInt("fees"));
			}
		}	
			public void fees1(int n)throws SQLException
			{
				Statement s=b.createStatement();
				ResultSet rs=s.executeQuery("select*from gym_members where fees<500");
				while(rs.next())
				{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+
					    rs.getString("batch")+"\t"+rs.getString("gender")
						+"\t"+rs.getInt("age")+"\t"+rs.getString("mob_no")+"\t+"+rs.getString("trainer_name")+
						rs.getInt("fees"));
				}
					
		   }
			public void count()throws SQLException
			{
				Statement s=b.createStatement();
				ResultSet rs=s.executeQuery("select sum(fees)from gym_members");
				while(rs.next())
				{
				System.out.println(rs.getInt("sum(fees)"));
					    
				
				}
			}
			public void co()throws SQLException
			{
				Statement s=b.createStatement();
				ResultSet rs=s.executeQuery("select count(id)from gym_members");
				while(rs.next())
				{
				System.out.println(rs.getInt("count(id)"));
					    
				
				}
			}
			public void logout()throws SQLException
			{
				System.out.println("thank you");			
			}
			public void profile(int id)throws SQLException
			{
				int q=0;
				PreparedStatement p=b.prepareStatement("select * from gym_members where id=?");
				p.setInt(1,id);
				ResultSet rs=p.executeQuery();
				while(rs.next())
				{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+
			    rs.getString("batch")+"\t"+rs.getString("gender")
				+"\t"+rs.getInt("age")+"\t"+rs.getString("mob_no")+"\t+"+rs.getString("trainer_name")+
				rs.getInt("fees"));	
				q++;
				}
				if(q==0)
				{
					System.out.println("Invalid id");
				}
			}
		}
       
	
		






