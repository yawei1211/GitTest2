package org.logistics.bean;
//人事表
public class Wlrenshi {

	//工作证号
	private String wlrenshiworknum;
	//姓名
	private String wlrenshiname;
	//性别
	private String wlrenshisex;
	//出生年月
	private String wlrenshichusheng;
	//身份证号
	private String wlrenshicardno;
	//居住地址
	private String wlrenshiaddress;
	//联系电话
	private String wlrenshitel;
	//部门编号
	private Wlbumen wlbumen;
	public String getWlrenshiworknum() {
		return wlrenshiworknum;
	}
	public void setWlrenshiworknum(String wlrenshiworknum) {
		this.wlrenshiworknum = wlrenshiworknum;
	}
	public String getWlrenshiname() {
		return wlrenshiname;
	}
	public void setWlrenshiname(String wlrenshiname) {
		this.wlrenshiname = wlrenshiname;
	}
	public String getWlrenshisex() {
		return wlrenshisex;
	}
	public void setWlrenshisex(String wlrenshisex) {
		this.wlrenshisex = wlrenshisex;
	}
	public String getWlrenshichusheng() {
		return wlrenshichusheng;
	}
	public void setWlrenshichusheng(String wlrenshichusheng) {
		this.wlrenshichusheng = wlrenshichusheng;
	}
	public String getWlrenshicardno() {
		return wlrenshicardno;
	}
	public void setWlrenshicardno(String wlrenshicardno) {
		this.wlrenshicardno = wlrenshicardno;
	}
	public String getWlrenshiaddress() {
		return wlrenshiaddress;
	}
	public void setWlrenshiaddress(String wlrenshiaddress) {
		this.wlrenshiaddress = wlrenshiaddress;
	}
	public String getWlrenshitel() {
		return wlrenshitel;
	}
	public void setWlrenshitel(String wlrenshitel) {
		this.wlrenshitel = wlrenshitel;
	}
	public Wlbumen getWlbumen() {
		return wlbumen;
	}
	public void setWlbumen(Wlbumen wlbumen) {
		this.wlbumen = wlbumen;
	}
	@Override
	public String toString() {
		return "Wlrenshi [wlrenshiworknum=" + wlrenshiworknum + ", wlrenshiname=" + wlrenshiname + ", wlrenshisex="
				+ wlrenshisex + ", wlrenshichusheng=" + wlrenshichusheng + ", wlrenshicardno=" + wlrenshicardno
				+ ", wlrenshiaddress=" + wlrenshiaddress + ", wlrenshitel=" + wlrenshitel + ", wlbumen=" + wlbumen
				+ "]";
	}
	

}
