package org.logistics.service;

import java.util.List;

import org.logistics.bean.Wluser;

public interface WluserService {

	public List<Wluser> getAlluser();
	public boolean addWluser(Wluser wluser);
	public boolean deleteWluser(Wluser wluser);
	public boolean updataWluser(Wluser wluser);
	public List<Wluser> getAllDetailByPageAndRows(int page,int rows);
}
