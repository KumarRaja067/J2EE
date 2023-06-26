package DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class delete_account
{
	public static void main(String[]args)
	{
		try
		{	Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url_link="jdbc:mysql://localhost:3306/login";
			String user_name="root";
			String password="root";	
			Connection con=DriverManager.getConnection(url_link,user_name,password);
			Statement st=con.createStatement();
			//System.out.println("enter tablename");
			//String tname=sc.nextLine();
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
			String str=null;
			System.out.println("delete operation ");

			PreparedStatement ps=con.prepareStatement("delete from signin  where email_id='"+email_id+"' or mobile_no= "+mobile_no);
			ps.execute();
		
			System.out.println(" Account deleted successfully");
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
}
