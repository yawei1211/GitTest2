package org.logistics.bean;
//库存信息表
public class Kcinfo {
	//入库编号
	private String kcinfonum;
	//订单号
	private String kcinfoddnum;
	//产品类别
	private String kcinfoleibie;
	//产品名称
	private String kcinfocpname;
	//产品所属公司
	private String kcinfosuoshu;
	//产品编号
	private String kcinfocpnum;
	//产品条形码
	private String kcinfotiaoxing;
	//产品箱号
	private String kcinfoxianghao;
	//产品数量
	private String kcinfocpshuliang;
	//实际入库数量
	private String kcinforukushu;
	//单位
	private String kcinfodanwei;
	//入库时间
	private String kcinforktime;
	//出库时间
	private String kcinfockshu;
	//备注
	private String kcinfobeizhu;
	public String getKcinfonum() {
		return kcinfonum;
	}
	public void setKcinfonum(String kcinfonum) {
		this.kcinfonum = kcinfonum;
	}
	public String getKcinfoddnum() {
		return kcinfoddnum;
	}
	public void setKcinfoddnum(String kcinfoddnum) {
		this.kcinfoddnum = kcinfoddnum;
	}
	public String getKcinfoleibie() {
		return kcinfoleibie;
	}
	public void setKcinfoleibie(String kcinfoleibie) {
		this.kcinfoleibie = kcinfoleibie;
	}
	public String getKcinfocpname() {
		return kcinfocpname;
	}
	public void setKcinfocpname(String kcinfocpname) {
		this.kcinfocpname = kcinfocpname;
	}
	public String getKcinfosuoshu() {
		return kcinfosuoshu;
	}
	public void setKcinfosuoshu(String kcinfosuoshu) {
		this.kcinfosuoshu = kcinfosuoshu;
	}
	public String getKcinfocpnum() {
		return kcinfocpnum;
	}
	public void setKcinfocpnum(String kcinfocpnum) {
		this.kcinfocpnum = kcinfocpnum;
	}
	public String getKcinfotiaoxing() {
		return kcinfotiaoxing;
	}
	public void setKcinfotiaoxing(String kcinfotiaoxing) {
		this.kcinfotiaoxing = kcinfotiaoxing;
	}
	public String getKcinfoxianghao() {
		return kcinfoxianghao;
	}
	public void setKcinfoxianghao(String kcinfoxianghao) {
		this.kcinfoxianghao = kcinfoxianghao;
	}
	public String getKcinfocpshuliang() {
		return kcinfocpshuliang;
	}
	public void setKcinfocpshuliang(String kcinfocpshuliang) {
		this.kcinfocpshuliang = kcinfocpshuliang;
	}
	public String getKcinforukushu() {
		return kcinforukushu;
	}
	public void setKcinforukushu(String kcinforukushu) {
		this.kcinforukushu = kcinforukushu;
	}
	public String getKcinfodanwei() {
		return kcinfodanwei;
	}
	public void setKcinfodanwei(String kcinfodanwei) {
		this.kcinfodanwei = kcinfodanwei;
	}
	public String getKcinforktime() {
		return kcinforktime;
	}
	public void setKcinforktime(String kcinforktime) {
		this.kcinforktime = kcinforktime;
	}
	public String getKcinfockshu() {
		return kcinfockshu;
	}
	public void setKcinfockshu(String kcinfockshu) {
		this.kcinfockshu = kcinfockshu;
	}
	public String getKcinfobeizhu() {
		return kcinfobeizhu;
	}
	public void setKcinfobeizhu(String kcinfobeizhu) {
		this.kcinfobeizhu = kcinfobeizhu;
	}
	@Override
	public String toString() {
		return "Kcinfo [kcinfonum=" + kcinfonum + ", kcinfoddnum=" + kcinfoddnum + ", kcinfoleibie=" + kcinfoleibie
				+ ", kcinfocpname=" + kcinfocpname + ", kcinfosuoshu=" + kcinfosuoshu + ", kcinfocpnum=" + kcinfocpnum
				+ ", kcinfotiaoxing=" + kcinfotiaoxing + ", kcinfoxianghao=" + kcinfoxianghao + ", kcinfocpshuliang="
				+ kcinfocpshuliang + ", kcinforukushu=" + kcinforukushu + ", kcinfodanwei=" + kcinfodanwei
				+ ", kcinforktime=" + kcinforktime + ", kcinfockshu=" + kcinfockshu + ", kcinfobeizhu=" + kcinfobeizhu
				+ "]";
	}
	
	

}
