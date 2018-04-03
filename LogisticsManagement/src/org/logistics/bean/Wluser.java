package org.logistics.bean;
//用户表
public class Wluser {

	//用户编号
	private String wluserid;
	//用户名
	private String wlusername;
	//用户密码
	private String wluserpwd;
	public String getWluserid() {
		return wluserid;
	}
	public void setWluserid(String wluserid) {
		this.wluserid = wluserid;
	}
	public String getWlusername() {
		return wlusername;
	}
	public void setWlusername(String wlusername) {
		this.wlusername = wlusername;
	}
	public String getWluserpwd() {
		return wluserpwd;
	}
	public void setWluserpwd(String wluserpwd) {
		this.wluserpwd = wluserpwd;
	}
	@Override
	public String toString() {
		return "Wluser [wluserid=" + wluserid + ", wlusername=" + wlusername + ", wluserpwd=" + wluserpwd + "]";
	}
	
}
