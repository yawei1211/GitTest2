package org.logistics.bean;
//�û���
public class Wluser {

	//�û����
	private String wluserid;
	//�û���
	private String wlusername;
	//�û�����
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
