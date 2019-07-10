package com.bawei.pojo;

import java.util.List;

/**
 *	商品类 
 */
public class Show {
	private Integer sid;
	private String sname;
	private List<Dianpu> dianpus;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Dianpu> getDianpus() {
		return dianpus;
	}
	public void setDianpus(List<Dianpu> dianpus) {
		this.dianpus = dianpus;
	}
	@Override
	public String toString() {
		return "Show [sid=" + sid + ", sname=" + sname + ", dianpus=" + dianpus
				+ "]";
	}
	public Show() {
		super();
	}
	
	
}
