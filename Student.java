package maven_project.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	private int rollno;
	@Column(name="sname")
	private StudentName name;
	private String subject;
	
	@OneToOne
	private Laptop laptop;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + ", laptop=" + laptop + "]";
	}
	
	

}
