package org.test.bean;

public class Classes {

	private Integer id;
	private String classname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", classname=" + classname + "]";
	}
	
}
