package testhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	private int empid;
	private String empname;
	@Id
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
