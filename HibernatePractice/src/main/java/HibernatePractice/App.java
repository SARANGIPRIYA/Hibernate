package HibernatePractice;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	EmpName obj=new EmpName();
    	obj.setEmpFirstName("Sarangi");
    	obj.setEmpMiddleName("Sai");
    	obj.setEmpLastName("leela");
//    	
        Mobile mobile=new Mobile();
       mobile.setMobileId(1);
        mobile.setCompany("Samsung");
        mobile.setMobileName("samsung");
        mobile.setEmpName(obj);
        
    	//Mobile mobile=null;
        Configuration con=new Configuration().configure().addAnnotatedClass(Mobile.class);
        
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
       session.save(mobile);//save a transaction
        
       
       // mobile=(Mobile)session.get(Mobile.class,1);//to get the record from databse
       
         tx.commit();
     System.out.println(mobile);
}
}