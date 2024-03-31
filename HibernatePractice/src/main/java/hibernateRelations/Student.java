package hibernateRelations;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int stId;
	@Column(name="Student_name")
	private String Sname;
	@Column(name="Student_marks")
	private int Marks;
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", Sname=" + Sname + ", Marks=" + Marks + "]";
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
//	@OneToOne
//	private Laptop lap;
//	public Laptop getLap() {
//		return lap;
//	}
//	public void setLap(Laptop lap) {
//		this.lap = lap;
//	}
	
//	@OneToMany(mappedBy="student")
//	private List<Laptop> lap=new ArrayList<Laptop>();
//	public List<Laptop> getLap() {
//		return lap;
//	}
//	public void setLap(List<Laptop> lap) {
//		this.lap = lap;
//	}
//	
}
