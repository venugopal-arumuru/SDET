package coms.DemoSpringBootApp.beans;
/*
 * Create table customer(cusid int auto_increment primary key, 
cusname varchar(20) not null, 
gender  varchar(10), 
location varchar(20), 
email  varchar(50), 
pasword varchar(20));
 */
public class Customer {

	private int cusid;
	private String cusname;
	private String gender;
	private String location;
	private String email;
	private String pasword;
	
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
}
