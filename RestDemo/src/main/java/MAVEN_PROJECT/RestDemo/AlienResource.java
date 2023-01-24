package MAVEN_PROJECT.RestDemo;

import java.sql.SQLException;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource {
	
	//this is a class which has aliens repository
	AlienRepository repo = new AlienRepository();
	
	@GET
	//THIS MEANS USER CAN REQUEST FOR XML OR JSON AS PER HIS WISH
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alien> fetchAliens() throws SQLException 
	{
		System.out.println("testing getAliens");
		return repo.getAliens();
		//here we are returning the list of objects, but in webpage or postman app we see that 
		//output is in json or xml format. It is because conversion from object to json/xml is 
		//happening because of jersey dependencies like: org.glassfish.jersey(for xml) etc
		//https://youtu.be/BZi44GOD8kY?t=7536
	}
	
	//{} should be used to convert the text to number format
	//@Pathparam should be used inorder to assign the parameter on the path to the id
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien fetchAlien(@PathParam("id") int id) throws SQLException 
	{
		System.out.println("testing getAlien");
		return repo.getAlien(id);
	} 
	
	@Path("alien")
	@POST
	//by specifying this we say that server doesn't accept data in any other format than XML or JSON
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien createAlien(Alien a) throws SQLException{
		System.out.println("POST REQUEST");
		repo.create(a);
		return a;
	}
	
	@Path("alien")
	@PUT
	//by specifying this we say that server doesn't accept data in any other format than XML or JSON
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien updateAlien(Alien a) throws SQLException{
		System.out.println("PUT REQUEST");
		//if ID is zero that means that entry is not there.
		if(repo.getAlien(a.getID()).getID()==0) {
			repo.create(a);
		}
		else {
			repo.update(a);
		}
		return a;
	}
	
	@DELETE
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien deleteAlien(@PathParam("id") int id) throws SQLException{
		
		System.out.println("DELETE REQUEST");

		Alien a= repo.getAlien(id); 
		//(if entry is not there then it returns null object)or
		//if entry with that id is not there then by default ID value of that entry is zero		
		if(a!=null) {
			repo.delete(id);			
		}
		return a;
		
	}

	
	
	
	
}
