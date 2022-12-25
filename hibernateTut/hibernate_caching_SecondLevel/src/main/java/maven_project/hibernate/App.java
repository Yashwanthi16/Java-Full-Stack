package maven_project.hibernate;

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
       sn.setFname("Panchapatla");
       sn.setMname("Saranga");
       sn.setLname("Paani");
       
       Student stud = new Student();
       stud.setRollno(3);
       stud.setName(sn);
       stud.setSubject("Science");
       
       Student stud2 = new Student();
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory(reg);
       
       Session session = sf.openSession();
       session.beginTransaction();
       stud2 = (Student) session.get(Student.class, 2);
       session.getTransaction().commit();
       System.out.println(stud2);
       session.close();
       
       Session session2 = sf.openSession();
       session2.beginTransaction();
       stud2 = (Student) session2.get(Student.class, 2);
       session2.getTransaction().commit();
       System.out.println(stud2);
       session2.close();
       
       
    }
}
