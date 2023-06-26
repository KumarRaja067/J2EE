package  DA0_TABLES;
import java.sql.*;
import java.util.*;
public class gmail_vrfy2 
// Mobile_no 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    String email="karu";
    String pswd="karu";
    String emailv="karu";
    String pswdv="karu";
    
    System.out.println("enter the emailid");
    String email1=sc.next();
    System.out.println("enter your password");
    String pswd1=sc.next();
    try 
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
     
     PreparedStatement p=con.prepareStatement("select email_id from signin");
     PreparedStatement p1=con.prepareStatement("select password from signin ");	
     PreparedStatement ps=con.prepareStatement("select * from signin where email_id='"+email1+"'&& password='"+pswd1+"'");
     ResultSet res=p.executeQuery();
     ResultSet resp1=p1.executeQuery();
     ResultSet res1=ps.executeQuery();
      while(res.next())
      {
        email=res.getString(1);
        if (email.equals(email1)) 
        {	emailv=email1;
          System.out.println("with emailid "+email1+" user is present ");
                   break;
        }
        else 
        {    	
        	//System.out.println("with emailid "+email1+" user is not present");
        }
        	
      }
      if(emailv.equals("karu"))
      {
    	  System.out.println("with emailid "+email1+" user is not present");
      }
      while(resp1.next())
      {
        pswd=resp1.getString(1);
        if (pswd.equals(pswd1))
        {	pswdv=pswd;
          System.out.println("with pswd ******* user is present");
          break;          
        }
        else 
        {
        	//System.out.println("with pwsd "+pswd1+" user is not present");
        }
        
      }
      if(pswdv.equals("karu"))
      {
    	  System.out.println("with pwsd "+pswd1+" user is not present");
      }
      if((emailv.equals(email1))&&(pswdv.equals(pswd1)))
      {
    	  PreparedStatement ps3=con.prepareStatement("update signin set email_id=(?) where id=5");
			
			ps3.setString(1,email1);
			ps3.execute();  
      }
      else
      {
        System.out.println("User data mismatches or not exists ");
        System.out.println("enter 1 to go for signup/login again \n 2 for forgotpassword");
        int n=sc.nextInt();
        switch(n)
        {
        case 1:          
          login_sign_case.main(args); 
          break;
        case 2:
        	forgotpassword.main(args);
        	break;
        }
      }
      System.out.println("login successfull");
          features.main(args);

      System.out.println("data displaying of user app entry ended");
    
    } 
    catch (ClassNotFoundException | SQLException e) 
    {
      e.printStackTrace();
    }
  }
}