package mini_project;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Connection;
public class gym {
	public static Connection b;
	
	
	public static void main(String []args) throws ClassNotFoundException{
	
		
	int i = 3;
	while(i>0)
	{
		try{
	    	
	    Scanner a=new Scanner (System.in);
	    gym_claas b=new gym_claas();
	   
	    
	    	
	    	System.out.println("enter user name");
	    	String un=a.next();
	    	System.out.println("enter a password");
	    	String pw=a.next();
	    	if(b.login(un, pw))
	    	{ 
	    		
	    System.out.println("1.insert a gym members");
	    System.out.println("2.view a gym members&equipments");
	    System.out.println("3.delete gym members");
	    System.out.println("4.update members");
	    System.out.println("5.trainer details");	
	    System.out.println("6.fees details");
    	System.out.println("7.total fees");
    	System.out.println("8.total gym members");
    	System.out.println("9.log out");
	    int num=a.nextInt();
	    if(num==1)
	    {
	    	 System.out.println("enter a name");
	    	 String n=a.next();
	    	 System.out.println("enter a batch");
	    	 String ba=a.next();
	    	 System.out.println("enter a gender");
	    	 String g=a.next();
	    	 System.out.println("enter a age");
	    	 int ag=a.nextInt();
	    	 System.out.println("enter a mob num");
	    	 String mn=a.next();
	    	 System.out.println("enter gym trainer name");
	    	 String gt=a.next();
	    	 System.out.println("enter a fees");
	    	 int f=a.nextInt();
	    	 b.insert(n,ba,g,ag,mn,gt,f);
	    }
	    else if(num==2)
	    {	
    	    System.out.println("1.view all details");
	        System.out.println("2.view particular details");
	        System.out.println("3.view all equipments");
	        System.out.println("4.view particular equipments");
	        int v=a.nextInt();
	      switch(v)
	      {
	        case 1:b.view(v,0);
	        break;
	        case 2:
	    	System.out.println("enter a id");
	    	int vi=a.nextInt();
	    	b.view(v,vi);
	    	break;
	        case 3:b.vq(v,0);
	        break;
	        case 4:
	    	System.out.println("enter a id");
	    	int vv=a.nextInt();
	    	b.vq(v,vv);
	    	break;
	    	default:
	    		System.out.println("invalid");
	    	
	      }
	    }
	    else if(num==3)
	      {
	    		System.out.println("enter a id");
	    		int id=a.nextInt();
	    		b.del(id);
	    		System.out.println("deleted");
	  
	    	}

	    else if(num==4)
	    {
	    	System.out.println("1.name");
	    	System.out.println("2.batch");
	    	System.out.println("3.gender");
	    	System.out.println("4.age");
	    	System.out.println("5.mob no");
	    	System.out.println("6.trainer name");
	    	System.out.println("7.fees");
	    	int u=a.nextInt();
	    	
	    	switch(u)
	    	{
	    	
	    	  case 1:
	    	  System.out.println("enter a name");
	    	  String na=a.next();
	    	  System.out.println("enter a id");
	    	  int id=a.nextInt();
	    	  b.name(na,id);
	    	  System.out.println("inserted");
	    	  break;
	    	  
	    	  case 2:
	    		  System.out.println("enter a batch");
		    	  String ba=a.next();
		    	  System.out.println("enter a id");
		    	  int bi=a.nextInt();
		    	  b.batch(ba,bi);
		    	  System.out.println("inserted");
		    	  break;
	    	  case 3:
	    		  System.out.println("enter a gender");
		    	  String g=a.next();
		    	  System.out.println("enter a id");
		    	  int d=a.nextInt();
		    	  b.gender(g,d);
		    	  System.out.println("inserted");
		    	  break;
	    	  case 4:
	    		  System.out.println("enter a age");
		    	  int age=a.nextInt();
		    	  System.out.println("enter a id");
		    	  int in=a.nextInt();
		    	  b.age(age,in);
		    	  System.out.println("inserted");
		    	  break;
	    	  case 5:
	    		  System.out.println("enter a mob no");
		    	  String mob=a.next();
		    	  System.out.println("enter a id");
		    	  int mb=a.nextInt();
		    	  b.mob(mob,mb);
		    	  System.out.println("inserted");
		    	  break;
	    	  case 6:
	    		  System.out.println("enter a trainer name");
		    	  String tna=a.next();
		    	  System.out.println("enter a id");
		    	  int tid=a.nextInt();
		    	  b.tn(tna,tid);
		    	  System.out.println("inserted");
		    	  break;
	    	  case 7:
	    		  System.out.println("enter a fees");
		    	  int fe=a.nextInt();
		    	  System.out.println("enter a id");
		    	  int fei=a.nextInt();
		    	  b.fees(fei,fe);
		    	  System.out.println("inserted");
		    	  break;
		    default:
		    	System.out.println("Invalid input");
		    	i=0;
	    	   }
	        }
	        else if(num==5)
	            {
	            	b.tr();
	            }
	        else if(num==6)
	            {
	            	System.out.println("1.499 above");
	            	System.out.println("2.500 below");
	            	int be=a.nextInt();
	            	switch(be)
	            	{
	            	case 1:
	            		b.fees(be);
	            		break;
	            	case 2:
	            		b.fees1(be);
	            		break;
	            	default:
	            		System.out.println("invalid");
	            			
	            	}
	        	}
	        else if(num==7)
	            {
	        	b.count();
	            }
	        else if(num==8)
            {
        	b.co();
            }
	        else if(num==9)
	        {
	        	b.logout();
	        	break;
	        }
	        else if(num>9)
	        {
	        	System.out.println("Please choose the valid option!...");
	        	break;
	        }
	    	
		
	    	}
	    	
	    	else {
	    		i--;
	    		System.out.println("Invalid input "+ i +" times more");
	    	}
	    
				
			
	    
		}
	    	
		
		
		catch(ClassNotFoundException|SQLException |InputMismatchException e)
		{
			System.out.println("Please enter the correct format!");
		}
	
		
	
	    }
	}
}


