package org.logistics.bean;
//入库信息表
public class Inputinfo {
	//主库编号
	private String inputnum;
	//订单号
	private String inputddnum;
	//产品类别
	private String inputcpleibie;
	//产品名称
	private String inputcpname;
	//产品所属公司
	private String inputsuoshu;
	//产品编码
	private String inputcpnum;
	//产品箱号
	private String inputcpxianghao;
	//产品总数量
	private String inputcpshuliang;
	//实际入库数量
	private String inputshijirukku;
	//单位
	private String inputdanwei;
	//入库时间
	private String inputrutime;
	//入库是否完成
	private String inputrutype;
	//备注
	private String inputbeizhu;
	public String getInputnum() {
		return inputnum;
	}
	public void setInputnum(String inputnum) {
		this.inputnum = inputnum;
	}
	public String getInputddnum() {
		return inputddnum;
	}
	public void setInputddnum(String inputddnum) {
		this.inputddnum = inputddnum;
	}
	public String getInputcpleibie() {
		return inputcpleibie;
	}
	public void setInputcpleibie(String inputcpleibie) {
		this.inputcpleibie = inputcpleibie;
	}
	public String getInputcpname() {
		return inputcpname;
	}
	public void setInputcpname(String inputcpname) {
		this.inputcpname = inputcpname;
	}
	public String getInputsuoshu() {
		return inputsuoshu;
	}
	public void setInputsuoshu(String inputsuoshu) {
		this.inputsuoshu = inputsuoshu;
	}
	public String getInputcpnum() {
		return inputcpnum;
	}
	public void setInputcpnum(String inputcpnum) {
		this.inputcpnum = inputcpnum;
	}
	public String getInputcpxianghao() {
		return inputcpxianghao;
	}
	public void setInputcpxianghao(String inputcpxianghao) {
		this.inputcpxianghao = inputcpxianghao;
	}
	public String getInputcpshuliang() {
		return inputcpshuliang;
	}
	public void setInputcpshuliang(String inputcpshuliang) {
		this.inputcpshuliang = inputcpshuliang;
	}
	public String getInputshijirukku() {
		return inputshijirukku;
	}
	public void setInputshijirukku(String inputshijirukku) {
		this.inputshijirukku = inputshijirukku;
	}
	public String getInputdanwei() {
		return inputdanwei;
	}
	public void setInputdanwei(String inputdanwei) {
		this.inputdanwei = inputdanwei;
	}
	public String getInputrutime() {
		return inputrutime;
	}
	public void setInputrutime(String inputrutime) {
		this.inputrutime = inputrutime;
	}
	public String getInputrutype() {
		return inputrutype;
	}
	public void setInputrutype(String inputrutype) {
		this.inputrutype = inputrutype;
	}
	public String getInputbeizhu() {
		return inputbeizhu;
	}
	public void setInputbeizhu(String inputbeizhu) {
		this.inputbeizhu = inputbeizhu;
	}
	@Override
	public String toString() {
		return "Inputinfo [inputnum=" + inputnum + ", inputddnum=" + inputddnum + ", inputcpleibie=" + inputcpleibie
				+ ", inputcpname=" + inputcpname + ", inputsuoshu=" + inputsuoshu + ", inputcpnum=" + inputcpnum
				+ ", inputcpxianghao=" + inputcpxianghao + ", inputcpshuliang=" + inputcpshuliang + ", inputshijirukku="
				+ inputshijirukku + ", inputdanwei=" + inputdanwei + ", inputrutime=" + inputrutime + ", inputrutype="
				+ inputrutype + ", inputbeizhu=" + inputbeizhu + "]";
	}
	
	
	

}
