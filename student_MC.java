package org.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class student_MC 
{
	public static void main(String[] args) 
	{
	  Scanner Nav=new Scanner(System.in);
		
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
	   
	  EntityManager em=emf.createEntityManager();
	  
	  EntityTransaction et=em.getTransaction();
	  
//	  student s=new student();
	  
	  System.out.println("TO INSERT RECORDS INTO TABLE ENTER 1");
	  
	  System.out.println("TO FETCH  RECORDS FROM TABLE ENTER 2");
		
	  System.out.println("TO UPDATE RECORDS IN   TABLE ENTER 3");
	  
	  System.out.println("TO DELETE RECORDS FROM TABLE ENTER 4");
	  
	  System.out.println("<<<<<<<<<<<<--------CHOOSE ANY OPTION------->>>>>>>>>>>>");
	  
	  int opt=Nav.nextInt();
	  
	  switch (opt) 
	  {
	     case 1:
	    	 System.out.println("HOW MANY RECORDS U WANT TO INSERT IN TABLE");
	    	 
	    	 int opt1=Nav.nextInt();
	    	 
	    	 while (opt1!=0) 
	    	 {
	    		 System.out.println("ENTER THE STUDENT ID");
		    	 
		    	 int id=Nav.nextInt();
		    	 
		    	 System.out.println("ENTER THE STUDENT NAME");
		    	 
		    	 String name=Nav.nextLine();
		    	        name=Nav.nextLine();
		    	        
		    	 System.out.println("ENTER THE STUDENT AGE");
		    	        
		    	 int age=Nav.nextInt();
		    	 
		    	 System.out.println("ENTER THE STUDENT PERCENTAGE");
		    	 
		    	 double percentage=Nav.nextDouble();
		    	 
		    	 System.out.println("ENTER THE STUDENT MOBILE NO");
		    	 
		    	 long mobile=Nav.nextLong();
		    	 
		    	 X_students s=new X_students();
		    	 
		    	 s.setId(id);
		    	 
		    	 s.setAge(age);
		    	 
		    	 s.setMobileno(mobile);
			
		    	 s.setName(name);
		    	 
		    	 s.setPercentage(percentage);
		    	 
		    	 et.begin();
		    	 
		    	 em.persist(s);
		    	 
		    	 opt1--;
		    	 
		    	 et.commit();
			 }
	    	 
		     break;
		  
	     case 2:
	    	 
	    	 System.out.println("ENTER THE ID TO FETCH THE STUDENT DETAILS");
	    	 
	    	 int id=Nav.nextInt();
	    	 
	    	 X_students s=em.find(X_students.class, id);
	    	 
	    	 System.out.println(s.getId());
	    	 
	    	 System.out.println(s.getName());
	    	 
	    	 System.out.println(s.getAge());
	    	 
	    	 System.out.println(s.getMobileno());
	    	 
	    	 System.out.println(s.getPercentage());
	    	 break;
	     case 3:
	    	 
	    	 System.out.println("ENTER THE STUDENT ID");
	    	 
	    	 int id1=Nav.nextInt();
	    	 
	    	 X_students s1=em.find(X_students.class, id1);
	    	 
	    	 System.out.println("1.NAME");
	    	 
	    	 System.out.println("2.AGE");
	    	 
	    	 System.out.println("3.MOBILE NO");
	    	 
	    	 System.out.println("4.PERCENTAGE");
	    	 
	    	 System.out.println("CHOOSE WHICH RECORD U WANT TO UPDATE");
	    	 
	    	 int opt2=Nav.nextInt();
	    	 
	    	 if (opt2==1) 
	    	 {
	    		 System.out.println("ENTER STUDENT NEW NAME");
	    		 
	    		 String name=Nav.nextLine();
	    		 
	    		        name=Nav.nextLine();
	    		        
				s1.setName(name);
				
				et.begin();
				
				em.merge(s1);
				
				et.commit();
			 }
	    	 else if (opt==2) 
	    	 {
               System.out.println("ENTER STUDENT NEW AGE");
	    		 
	    		 int age=Nav.nextInt();
	    		        
				s1.setAge(age);
				
				et.begin();
				
				em.merge(s1);
				
				et.commit();
			 }
	    	 else if (opt==3) 
	    	 {
                System.out.println("ENTER STUDENT NEW MOBILE NO");
	    		 
	    		long mobileno=Nav.nextLong();
	    		        
				s1.setMobileno(mobileno);
				
				et.begin();
				
				em.merge(s1);
				
				et.commit();
			 }
	    	 else if (opt==4) 
	    	 {
	    		 System.out.println("ENTER STUDENT NEW PERCENTAGE");
	    		 
		    		float percentage=Nav.nextFloat();
		    		        
					s1.setPercentage(percentage);
					
					et.begin();
					
					em.merge(s1);
					
					et.commit();
			 }
	    	 
	    	 break;
	    	 
	     case 4:
	    	 System.out.println("ENTER THE STUDENT ID TO DELETE RECORD");
	    	 
	    	 int id2=Nav.nextInt();
	    	 
	    	 X_students s2=em.find(X_students.class, id2);
	    	 
	    	 et.begin();
	    	 
	    	 em.remove(s2);
	    	 
	    	 et.commit();
	    	 
	    	 break;
	    	 

	default:
		break;
	}
	}

}
