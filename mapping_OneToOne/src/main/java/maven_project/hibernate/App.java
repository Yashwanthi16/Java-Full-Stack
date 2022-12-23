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
    Laptop ln = new Laptop();
    ln.setLid(101);
    ln.setName("HP");
       StudentName sn = new StudentName();
       sn.setFname("guru");
       sn.setMname("pitha");
       sn.setLname("susma");
       
       Student stud = new Student();
       stud.setRollno(1);
       stud.setName(sn);
       stud.setSubject("Science");
       stud.setLaptop(ln);
      
       Student stud2 = new Student();
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf = con.buildSessionFactory(reg);
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       //session.save(stud);
       //session.save(ln);
       stud2 = (Student) session.get(Student.class, 1);
       tx.commit();
       System.out.println(ln);
       System.out.println(stud2);
    }
}
