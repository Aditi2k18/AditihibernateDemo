package aditi.demo.hibernate.test;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import aditi.demo.hibernate.dto.Address;
import aditi.demo.hibernate.dto.UserProfile;

public class UserProfileMain {

	public static void main(String[] args) {
		
		//UserProfile user2 =new UserProfile();
		//UserProfile userRet =new UserProfile();
		 Address address=new Address();
		 address.setCity("City Name");
		 address.setStreet("Street Name");
		 address.setPincode("Pincode");
		 
		 UserProfile user =new UserProfile();
		 user.setUserName("First User");
		 user.setJoiningDate(new Date());
		 user.setUserDescription("User Description goes here");
		 user.setAddress(address);
		 
		/* user2.setUserName("Second User");
		 user2.setJoiningDate(new Date());
		 user2.setUserDescription("User2  Description goes here");*/
		 
		 
		 
		 
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 Session session =sessionFactory.openSession();
		 session.beginTransaction();
		 session.save(user);
		 
		// session.save(user2);
		 session.getTransaction().commit();
		 session.close();
		 /*session = sessionFactory.openSession();
		 userRet=session.get(UserProfile.class,1);
		 session.close();
		 System.out.println("username ="+userRet.getUserName());*/
		 
		 
		 
	}

}
