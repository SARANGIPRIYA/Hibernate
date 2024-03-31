package HQlEg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hql_query")
public class StudentsH {
	@Id
	private int stuId;
	@Override
	public String toString() {
		return "StudentsH [stuId=" + stuId + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	private String name;
	private int marks;
}
