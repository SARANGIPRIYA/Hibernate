package HibernatePractice;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Mobile {
@Id
int mobileId;
String mobileName;
String company;
EmpName empName;

public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}


public EmpName getEmpName() {
	return empName;
}
public void setEmpName(EmpName empName) {
	this.empName = empName;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", company=" + company + ", empName="
			+ empName + "]";
}

}
