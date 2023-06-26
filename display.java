package DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class display 
{
	public static void main(String[]args)
	{		Scanner sc=new Scanner(System.in);
		try
		{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/login";
			String user_name="root";
			String password="root";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();
			System.out.println("display operation start");
//			phne_pwd_verify obj=new phne_pwd_verify();
//			String str4=obj.str1;
//			System.out.println(str4);
			//
			ResultSet rs3=st.executeQuery("select email_id from signin where id=5");
			String email_id="karu";
			if(rs3.next())
			{
			 email_id=rs3.getString(1);
			//System.out.println(email_id);
			}
			ResultSet rs4=st.executeQuery("select mobile_no from signin where id=5");
			long mobile_no=123;
			if(rs4.next())
			{
			mobile_no=rs4.getLong(1);
			//System.out.println( mobile_no);
			}
			//em1="";
			System.out.println();
			//
			ResultSet rs=st.executeQuery("select * from signin where email_id='"+email_id+"' or mobile_no= "+mobile_no);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String username=rs.getString(2);
				long phone=rs.getLong(3);
				System.out.println("displaying only non-confidential data of user");
				System.out.println(id+" | "+username+" | "+phone);
				break;
			}
			System.out.println("display operation end");
			features.main(args);
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		
		System.out.println();
	}

}
