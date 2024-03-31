package HQlEg;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Main {
	public static void main(String args[]) {



		Configuration conf=new Configuration().configure().addAnnotatedClass(StudentsH.class);
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();

		//random class to generatte random values
		//	Random r=new Random();

		//to get values by using loops

		//	for(int i = 1;i<50;i++) {
		//		StudentsH sObj=new StudentsH();
		//		sObj.setStuId(i);
		//		sObj.setName("Name"+" "+i);
		//		sObj.setMarks(r.nextInt(100));
		//		session.save(sObj);
		//		System.out.println(sObj);
		//		
		//	}


		//list with whre clause.

		//	Query q=session.createQuery("from StudentsH where marks > 50");//for list 
		//	List <StudentsH> students= q.list();
		//		for(StudentsH s:students) {
		//	System.out.println(s);
		//}

		//for one val

		//	Query q=session.createQuery("from StudentsH where stuId = 7");//for list 
		//	StudentsH student= (StudentsH) q.uniqueResult();
		//	System.out.println(student);
		//	

		//Object ie particular complete row

		//Query q= session.createQuery("select stuId,name,marks from StudentsH  where stuId=7");
		//Object[] student=(Object[]) q.uniqueResult();
		//for(Object o:student) {
		//	System.out.println(o);
		//}
		//SQLQUERY in hibernate
		//SQLQuery query=session.createSqlQuery("select * from StudentsH where marks>65");
		//List students=query.list();

		session.beginTransaction().commit();

	}
}
