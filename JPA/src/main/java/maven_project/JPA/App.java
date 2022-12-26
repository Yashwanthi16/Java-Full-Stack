package maven_project.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
     	 
        Alien a = new Alien();
        a.setAid(3);
        a.setAname("Nikhil DD");
        a.setAcolor("Black");
        Alien b = new Alien();  
        
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("A");
        EntityManager em = emf.createEntityManager();
       
        em.getTransaction().begin();
        //em.persist(a);
        b = (Alien)em.find(Alien.class,2);
        em.getTransaction().commit();
        System.out.println(b);
    }
}
