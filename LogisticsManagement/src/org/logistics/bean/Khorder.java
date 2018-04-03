package org.logistics.bean;
//客户订单表
public class Khorder {

	//客户编号
	private String khordernum;
	//订单编号
	private String khorderordernum;
	//运输方式
	private String khorderystrpe;
	//发货目的地
	private String khorderfhspace;
	//收货人编号
	private String khordershnum;
	//预计发货时间
	private String khorderfhtime;
	//预计到达时间
	private String khorderddtime;
	//订单生成时间
	private String khordersctime;
	//是否发货
	private String khordertype;
	//操作员姓名
	private String khorderczyuan;
	//操作员所在地
	private String khorderczadd;
	//备注
	private String khorderbeizhu;
	public String getKhordernum() {
		return khordernum;
	}
	public void setKhordernum(String khordernum) {
		this.khordernum = khordernum;
	}
	public String getKhorderordernum() {
		return khorderordernum;
	}
	public void setKhorderordernum(String khorderordernum) {
		this.khorderordernum = khorderordernum;
	}
	public String getKhorderystrpe() {
		return khorderystrpe;
	}
	public void setKhorderystrpe(String khorderystrpe) {
		this.khorderystrpe = khorderystrpe;
	}
	public String getKhorderfhspace() {
		return khorderfhspace;
	}
	public void setKhorderfhspace(String khorderfhspace) {
		this.khorderfhspace = khorderfhspace;
	}
	public String getKhordershnum() {
		return khordershnum;
	}
	public void setKhordershnum(String khordershnum) {
		this.khordershnum = khordershnum;
	}
	public String getKhorderfhtime() {
		return khorderfhtime;
	}
	public void setKhorderfhtime(String khorderfhtime) {
		this.khorderfhtime = khorderfhtime;
	}
	public String getKhorderddtime() {
		return khorderddtime;
	}
	public void setKhorderddtime(String khorderddtime) {
		this.khorderddtime = khorderddtime;
	}
	public String getKhordersctime() {
		return khordersctime;
	}
	public void setKhordersctime(String khordersctime) {
		this.khordersctime = khordersctime;
	}
	public String getKhordertype() {
		return khordertype;
	}
	public void setKhordertype(String khordertype) {
		this.khordertype = khordertype;
	}
	public String getKhorderczyuan() {
		return khorderczyuan;
	}
	public void setKhorderczyuan(String khorderczyuan) {
		this.khorderczyuan = khorderczyuan;
	}
	public String getKhorderczadd() {
		return khorderczadd;
	}
	public void setKhorderczadd(String khorderczadd) {
		this.khorderczadd = khorderczadd;
	}
	public String getKhorderbeizhu() {
		return khorderbeizhu;
	}
	public void setKhorderbeizhu(String khorderbeizhu) {
		this.khorderbeizhu = khorderbeizhu;
	}
	@Override
	public String toString() {
		return "Khorder [khordernum=" + khordernum + ", khorderordernum=" + khorderordernum + ", khorderystrpe="
				+ khorderystrpe + ", khorderfhspace=" + khorderfhspace + ", khordershnum=" + khordershnum
				+ ", khorderfhtime=" + khorderfhtime + ", khorderddtime=" + khorderddtime + ", khordersctime="
				+ khordersctime + ", khordertype=" + khordertype + ", khorderczyuan=" + khorderczyuan
				+ ", khorderczadd=" + khorderczadd + ", khorderbeizhu=" + khorderbeizhu + "]";
	}
	
}
