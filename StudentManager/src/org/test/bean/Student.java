package org.test.bean;

public class Student {

	private Integer id;
	private String name;
	private String age;
	private String mobile;
	private String email;
	private Classes classid;
	private String addtime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Classes getClassid() {
		return classid;
	}
	public void setClassid(Classes classid) {
		this.classid = classid;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", email=" + email
				+ ", classid=" + classid + ", addtime=" + addtime + "]";
	}
	
	
	
}
