package org.logistics.bean;
//出库信息表
public class Outputinfo {

	//出库编号
	private String outputnum;
	//订单号
	private String outputddnum;
	//产品类别
	private String outputcpleibie;
	//产品名称
	private String outputcpname;
	//产品所属公司
	private String outputsuoshu;
	//产品编号
	private String outputcpnum;
	//产品条形码
	private String outputcptiao;
	//产品箱号
	private String outputcpxianghao;
	//应该出库数量
	private String outputyckshuliang;
	//实际出库数量
	private String outputshijichuku;
	//单位
	private String outputdanwei;
	//出库时间
	private String outputouttime;
	//是否已完全出库
	private String outputouttype;
	//是否达到目的地
	private String outputmddtype;
	//备注
	private String outputbeizhu;
	public String getOutputnum() {
		return outputnum;
	}
	public void setOutputnum(String outputnum) {
		this.outputnum = outputnum;
	}
	public String getOutputddnum() {
		return outputddnum;
	}
	public void setOutputddnum(String outputddnum) {
		this.outputddnum = outputddnum;
	}
	public String getOutputcpleibie() {
		return outputcpleibie;
	}
	public void setOutputcpleibie(String outputcpleibie) {
		this.outputcpleibie = outputcpleibie;
	}
	public String getOutputcpname() {
		return outputcpname;
	}
	public void setOutputcpname(String outputcpname) {
		this.outputcpname = outputcpname;
	}
	public String getOutputsuoshu() {
		return outputsuoshu;
	}
	public void setOutputsuoshu(String outputsuoshu) {
		this.outputsuoshu = outputsuoshu;
	}
	public String getOutputcpnum() {
		return outputcpnum;
	}
	public void setOutputcpnum(String outputcpnum) {
		this.outputcpnum = outputcpnum;
	}
	public String getOutputcptiao() {
		return outputcptiao;
	}
	public void setOutputcptiao(String outputcptiao) {
		this.outputcptiao = outputcptiao;
	}
	public String getOutputcpxianghao() {
		return outputcpxianghao;
	}
	public void setOutputcpxianghao(String outputcpxianghao) {
		this.outputcpxianghao = outputcpxianghao;
	}
	public String getOutputyckshuliang() {
		return outputyckshuliang;
	}
	public void setOutputyckshuliang(String outputyckshuliang) {
		this.outputyckshuliang = outputyckshuliang;
	}
	public String getOutputshijichuku() {
		return outputshijichuku;
	}
	public void setOutputshijichuku(String outputshijichuku) {
		this.outputshijichuku = outputshijichuku;
	}
	public String getOutputdanwei() {
		return outputdanwei;
	}
	public void setOutputdanwei(String outputdanwei) {
		this.outputdanwei = outputdanwei;
	}
	public String getOutputouttime() {
		return outputouttime;
	}
	public void setOutputouttime(String outputouttime) {
		this.outputouttime = outputouttime;
	}
	public String getOutputouttype() {
		return outputouttype;
	}
	public void setOutputouttype(String outputouttype) {
		this.outputouttype = outputouttype;
	}
	public String getOutputmddtype() {
		return outputmddtype;
	}
	public void setOutputmddtype(String outputmddtype) {
		this.outputmddtype = outputmddtype;
	}
	public String getOutputbeizhu() {
		return outputbeizhu;
	}
	public void setOutputbeizhu(String outputbeizhu) {
		this.outputbeizhu = outputbeizhu;
	}
	@Override
	public String toString() {
		return "Outputinfo [outputnum=" + outputnum + ", outputddnum=" + outputddnum + ", outputcpleibie="
				+ outputcpleibie + ", outputcpname=" + outputcpname + ", outputsuoshu=" + outputsuoshu
				+ ", outputcpnum=" + outputcpnum + ", outputcptiao=" + outputcptiao + ", outputcpxianghao="
				+ outputcpxianghao + ", outputyckshuliang=" + outputyckshuliang + ", outputshijichuku="
				+ outputshijichuku + ", outputdanwei=" + outputdanwei + ", outputouttime=" + outputouttime
				+ ", outputouttype=" + outputouttype + ", outputmddtype=" + outputmddtype + ", outputbeizhu="
				+ outputbeizhu + "]";
	}
	
}
