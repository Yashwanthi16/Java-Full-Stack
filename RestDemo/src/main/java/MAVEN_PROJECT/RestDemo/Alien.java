package MAVEN_PROJECT.RestDemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	
	public int ID;
	public String name;
	public int points;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Alien [ID=" + ID + ", name=" + name + ", points=" + points + "]";
	}
	
}
