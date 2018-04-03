package org.logistics.bean;
//客户信息表
public class Khinfo {

	//客户编号
	private String khinfonum;
	//公司名称
	private String khinfogsname;
	//公司所在地址
	private String khinfogsadd;
	//联系人姓名
	private String khinfoper;
	//联系电话
	private String khinfotel;
	//email
	private String khinfoemail;
	//订单号
	private String khinfoordernum;
	//备注
	private String khinfobeizhu;
	public String getKhinfonum() {
		return khinfonum;
	}
	public void setKhinfonum(String khinfonum) {
		this.khinfonum = khinfonum;
	}
	public String getKhinfogsname() {
		return khinfogsname;
	}
	public void setKhinfogsname(String khinfogsname) {
		this.khinfogsname = khinfogsname;
	}
	public String getKhinfogsadd() {
		return khinfogsadd;
	}
	public void setKhinfogsadd(String khinfogsadd) {
		this.khinfogsadd = khinfogsadd;
	}
	public String getKhinfoper() {
		return khinfoper;
	}
	public void setKhinfoper(String khinfoper) {
		this.khinfoper = khinfoper;
	}
	public String getKhinfotel() {
		return khinfotel;
	}
	public void setKhinfotel(String khinfotel) {
		this.khinfotel = khinfotel;
	}
	public String getKhinfoemail() {
		return khinfoemail;
	}
	public void setKhinfoemail(String khinfoemail) {
		this.khinfoemail = khinfoemail;
	}
	public String getKhinfoordernum() {
		return khinfoordernum;
	}
	public void setKhinfoordernum(String khinfoordernum) {
		this.khinfoordernum = khinfoordernum;
	}
	public String getKhinfobeizhu() {
		return khinfobeizhu;
	}
	public void setKhinfobeizhu(String khinfobeizhu) {
		this.khinfobeizhu = khinfobeizhu;
	}
	@Override
	public String toString() {
		return "Khinfo [khinfonum=" + khinfonum + ", khinfogsname=" + khinfogsname + ", khinfogsadd=" + khinfogsadd
				+ ", khinfoper=" + khinfoper + ", khinfotel=" + khinfotel + ", khinfoemail=" + khinfoemail
				+ ", khinfoordernum=" + khinfoordernum + ", khinfobeizhu=" + khinfobeizhu + "]";
	}
	
}
