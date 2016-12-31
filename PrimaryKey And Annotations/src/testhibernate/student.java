package testhibernate;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="studentdetails")
public class student {
	private int empid;
	private String empname;
	private String email;
	private String password;
	private boolean fulltime;
	private Date emplogin;
	private Calendar empjoindate;
	
	//@Column(nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Transient
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Basic
	public boolean isFulltime() {
		return fulltime;
	}
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEmplogin() {
		return emplogin;
	}
	public void setEmplogin(Date emplogin) {
		this.emplogin = emplogin;
	}
	@Temporal(TemporalType.DATE)
	public Calendar getEmpjoindate() {
		return empjoindate;
	}
	public void setEmpjoindate(Calendar empjoindate) {
		this.empjoindate = empjoindate;
	}
	@Id
	@TableGenerator(name="empid",table="empid", pkColumnName="uniqueid", pkColumnValue="uniquevalue",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empid")
	@Column(name="EmployeeId")
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
