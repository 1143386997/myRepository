package com.bawei.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *	店铺类 
 */
public class Dianpu {
	private Integer did;
	private String dname;
	private Date createtime;
	private List<Show> shows;
	
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = simpleDateFormat.parse(createtime);
		this.createtime = parse;
	}
	public Dianpu() {
		super();
	}
	@Override
	public String toString() {
		return "Dianpu [did=" + did + ", dname=" + dname + ", createtime="
				+ createtime + "]";
	}
	
	
}
