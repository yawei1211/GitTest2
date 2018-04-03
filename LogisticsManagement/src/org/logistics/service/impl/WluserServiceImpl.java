package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Wluser;
import org.logistics.dao.WluserDao;
import org.logistics.service.WluserService;

public class WluserServiceImpl implements WluserService{

	private WluserDao wluserDao;
	public void setWluserDao(WluserDao wluserDao) {
		this.wluserDao = wluserDao;
	}

	@Override
	public List<Wluser> getAlluser() {
		// TODO Auto-generated method stub
		return wluserDao.getAlluser();
	}

	@Override
	public boolean addWluser(Wluser wluser) {
		// TODO Auto-generated method stub
		return wluserDao.addWluser(wluser);
	}

	@Override
	public boolean deleteWluser(Wluser wluser) {
		// TODO Auto-generated method stub
		return wluserDao.deleteWluser(wluser);
	}

	@Override
	public boolean updataWluser(Wluser wluser) {
		// TODO Auto-generated method stub
		return wluserDao.updataWluser(wluser);
	}

	@Override
	public List<Wluser> getAllDetailByPageAndRows(int page, int rows) {
		// TODO Auto-generated method stub
		return wluserDao.getAllWluserByPageAndRows(page, rows);
	}

	
	
}
