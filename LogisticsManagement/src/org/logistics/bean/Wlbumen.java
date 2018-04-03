package org.logistics.bean;
//用户部门表
public class Wlbumen {

	//部门编号
	private String wlbumennum;
	//部门名称
	private String wlbumenname;
	public String getWlbumennum() {
		return wlbumennum;
	}
	public void setWlbumennum(String wlbumennum) {
		this.wlbumennum = wlbumennum;
	}
	public String getWlbumenname() {
		return wlbumenname;
	}
	public void setWlbumenname(String wlbumenname) {
		this.wlbumenname = wlbumenname;
	}
	@Override
	public String toString() {
		return "Wlbumen [wlbumennum=" + wlbumennum + ", wlbumenname=" + wlbumenname + "]";
	}
	
}
