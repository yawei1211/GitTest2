package org.logistics.bean;
//�û����ű�
public class Wlbumen {

	//���ű��
	private String wlbumennum;
	//��������
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
