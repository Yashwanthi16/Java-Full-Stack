package maven_project.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Registry")
public class Student {
	
	@Id
	private int rollno;
	@Column(name="sname")
	private StudentName name;
	private String subject;
	
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
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", subject=" + subject + "]";
	}
	
	

}
