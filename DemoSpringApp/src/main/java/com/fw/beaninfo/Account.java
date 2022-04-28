package com.fw.beaninfo;

public class Account {

	private String accno;
	private String acctype;
	private float amount;
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "accno=" + accno + ", acctype=" + acctype + ", amount=" + amount;
	}
	
	
	
	
}
