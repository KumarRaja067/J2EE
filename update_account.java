
package   DA0_TABLES;
import java.sql.*;
import java.util.Scanner;
public class update_account 
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
			System.out.println("enter 1 to update username \n 2 to update emailid \n 3 to update phoneno");
			int num=sc.nextInt();
			String onme1=null;
			String nnme1=null;
			switch(num)
			{
			case 1: System.out.println("enter old name");
					String onme=sc.next();
					onme1="username= '"+onme+"'";
					System.out.println("enter new name");
					String	nnme=sc.next();
					nnme1="username= '"+nnme+"'";	
					break;
			case 2:System.out.println("enter old email");
					String onme3=sc.next();
					onme1="email_id= '"+onme3+"'";
					System.out.println("enter new new email");
					String	nnme3=sc.next();
					nnme1="email_id= '"+nnme3+"'";
					break;
			case 3:	System.out.println("enter old phno");
					long ph=sc.nextLong();
					onme1="mobile_no= "+ph+"";
					System.out.println("enter new phno");
					long ph1=sc.nextLong();
					nnme1="mobile_no= "+ph1+"";
					break;
			}
			PreparedStatement ps=con.prepareStatement("update signin set "+nnme1+" where email_id='"+email_id+"' or mobile_no= "+mobile_no	);
			ps.execute();
			System.out.println("updated successfully");
			features.main(args);
			con.close();
		}
			catch(ClassNotFoundException | SQLException obj)
			{
				obj.printStackTrace();
			}
		}
}
