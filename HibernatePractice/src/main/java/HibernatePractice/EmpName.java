package HibernatePractice;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
@Embeddable
public class EmpName {
	@Column(name="first_name")
 private String empFirstName;
	@Column(name="last_name")
 private String empLastName;
	@Column(name="middle_name")
 private String empMiddleName;
	@Override
	public String toString() {
		return "empName [empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", empMiddleName="
				+ empMiddleName + "]";
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpMiddleName() {
		return empMiddleName;
	}
	public void setEmpMiddleName(String empMiddleName) {
		this.empMiddleName = empMiddleName;
	}
 
}
