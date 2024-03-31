package hibernateRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
public static void main(String args[]) {
	Laptop laptop=new Laptop();
//	laptop.setlId(13);
//	laptop.setLname("Hp");
//	
	
	Student student =new Student();
//	student.setStId(113);
//	student.setSname("wadz");
//	student.setMarks(79);
//	student.getLap().add(laptop);
//	laptop.getStu().add(student);
	
	 Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
     
     SessionFactory sf=con.buildSessionFactory();
     Session session=sf.openSession();
     session.beginTransaction();
//     session.save(student);
//     session.save(laptop);
     student=(Student) session.get(Student.class,101);
     session.getTransaction().commit();
     
     //we have two sessions where same numberId we are pasing to get information sm num diff sessions two times queries will display
     //first level cache 
     //second level update ehchache pom.xml,add two annotations @cache,@chacheable, in property we should add two property.
     
     
     Session session1=sf.openSession();
     session.beginTransaction();
//     session.save(student);
//     session.save(laptop);
     student=(Student) session1.get(Student.class,101);
     session.getTransaction().commit();
}
}
