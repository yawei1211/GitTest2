package org.logistics.bean;
//�ͻ���Ϣ��
public class Khinfo {

	//�ͻ����
	private String khinfonum;
	//��˾����
	private String khinfogsname;
	//��˾���ڵ�ַ
	private String khinfogsadd;
	//��ϵ������
	private String khinfoper;
	//��ϵ�绰
	private String khinfotel;
	//email
	private String khinfoemail;
	//������
	private String khinfoordernum;
	//��ע
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
