package org.logistics.action;

import java.util.List;

import org.logistics.bean.Wluser;
import org.logistics.service.WluserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONObject;

public class WluserAction extends ActionSupport implements ModelDriven<Wluser>{

	private Wluser wluser=new Wluser();
	private WluserService wluserService;
	private List<Wluser> list;
	private Integer id;
	private String rows;
	private String page;
	private JSONObject jsonObject;
	public Wluser getWluser() {
		return wluser;
	}
	public void setWluser(Wluser wluser) {
		this.wluser = wluser;
	}
	public WluserService getWluserService() {
		return wluserService;
	}
	public void setWluserService(WluserService wluserService) {
		this.wluserService = wluserService;
	}
	public List<Wluser> getList() {
		return list;
	}
	public void setList(List<Wluser> list) {
		this.list = list;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	public String getAllWluser() {
		int rows1=Integer.parseInt(rows);
		int page1=Integer.parseInt(page);
		list=wluserService.getAllDetailByPageAndRows(page1, rows1);
		return null;
	}
	@Override
	public Wluser getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
