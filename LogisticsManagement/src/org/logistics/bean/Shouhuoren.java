package org.logistics.bean;
//收货人信息
public class Shouhuoren {

	//编号
	private String shrnum;
	//收货公司
	private String shrgongsi;
	//收货人
	private String shrname;
	//所在地
	private String shradd;
	//联系电话
	private String shrtel;
	//email
	private String shremail;
	//订单号
	private String shrordernum;
	//收货状态
	private String shrtype;
	//备注
	private String shrbeizhu;
	public String getShrnum() {
		return shrnum;
	}
	public void setShrnum(String shrnum) {
		this.shrnum = shrnum;
	}
	public String getShrgongsi() {
		return shrgongsi;
	}
	public void setShrgongsi(String shrgongsi) {
		this.shrgongsi = shrgongsi;
	}
	public String getShrname() {
		return shrname;
	}
	public void setShrname(String shrname) {
		this.shrname = shrname;
	}
	public String getShradd() {
		return shradd;
	}
	public void setShradd(String shradd) {
		this.shradd = shradd;
	}
	public String getShrtel() {
		return shrtel;
	}
	public void setShrtel(String shrtel) {
		this.shrtel = shrtel;
	}
	public String getShremail() {
		return shremail;
	}
	public void setShremail(String shremail) {
		this.shremail = shremail;
	}
	public String getShrordernum() {
		return shrordernum;
	}
	public void setShrordernum(String shrordernum) {
		this.shrordernum = shrordernum;
	}
	public String getShrtype() {
		return shrtype;
	}
	public void setShrtype(String shrtype) {
		this.shrtype = shrtype;
	}
	public String getShrbeizhu() {
		return shrbeizhu;
	}
	public void setShrbeizhu(String shrbeizhu) {
		this.shrbeizhu = shrbeizhu;
	}
	@Override
	public String toString() {
		return "Shouhouren [shrnum=" + shrnum + ", shrgongsi=" + shrgongsi + ", shrname=" + shrname + ", shradd="
				+ shradd + ", shrtel=" + shrtel + ", shremail=" + shremail + ", shrordernum=" + shrordernum
				+ ", shrtype=" + shrtype + ", shrbeizhu=" + shrbeizhu + "]";
	}
	
	
}
