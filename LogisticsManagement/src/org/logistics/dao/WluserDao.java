package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Wluser;

public interface WluserDao {

	public List<Wluser> getAlluser();
	public boolean addWluser(Wluser wluser);
	public boolean deleteWluser(Wluser wluser);
	public boolean updataWluser(Wluser wluser);
	public List<Wluser> getAllWluserByPageAndRows(int page,int rows);
}
