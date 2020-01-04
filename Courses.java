package com.del.test.entity;

public class Courses 
{
    int cid;
    String cname;
    int cd;
    double cfee;
	public Courses() {}
	public Courses(int cid, String cname, int cd, double cfee) 
	{
		
		this.cid = cid;
		this.cname = cname;
		this.cd = cd;
		this.cfee = cfee;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
	}
	public double getCfee() {
		return cfee;
	}
	public void setCfee(double cfee) {
		this.cfee = cfee;
	}
	
		
	}
    

