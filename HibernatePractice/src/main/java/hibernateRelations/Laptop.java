package hibernateRelations;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lId;
	@Column(name="Laptop_name")
	private String lname;
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lname=" + lname + "]";
	}
//@ManyToOne
//	private Student stu;
//	public Student getStu() {
//		return stu;
//	}
//	public void setStu(Student stu) {
//		this.stu = stu;
//	}
//	@ManyToOne 
//	private List<Student> stu =new ArrayList<Student>();
//	public List<Student> getStu() {
//		return stu;
//	}
//	public void setStu() {
//		this.stu = stu;
//	}
	
}
