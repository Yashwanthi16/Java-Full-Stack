package maven_project.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
       StudentName sn = new StudentName();
       sn.setFname("Arizaona");
       sn.setMname("Viru");
       sn.setLname("Sillu");
       
       Student stud = new Student();
       stud.setRollno(1);
       stud.setName(sn);
       stud.setSubject("Arts");
       
       Student stud2 = new Student();
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory(reg);
       
       Session session = sf.openSession();
       session.beginTransaction();
       Query q1= session.createQuery("from Student where rollno=2");
       q1.setCacheable(true);
       stud2 = (Student) q1.uniqueResult();
       System.out.println(stud2);
       session.getTransaction().commit();
       session.close();
       
       Session session2 = sf.openSession();
       session2.beginTransaction();
       Query q2= session2.createQuery("from Student where rollno=2");
       q2.setCacheable(true);
       stud2 = (Student) q2.uniqueResult();
       System.out.println(stud2);
       session2.getTransaction().commit();
       session2.close();
       
       
    }
}
