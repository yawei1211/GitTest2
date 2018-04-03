package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Wlrenshi;
import org.logistics.dao.WlrenshiDao;
import org.logistics.service.WlrenshiService;

public class WlrenshiServiceImpl implements WlrenshiService{

	private WlrenshiDao wlrenshiDao;
	public void setWlrenshiDao(WlrenshiDao wlrenshiDao) {
		this.wlrenshiDao = wlrenshiDao;
	}

	@Override
	public List<Wlrenshi> getAllrenshi() {
		// TODO Auto-generated method stub
		return wlrenshiDao.getAllrenshi();
	}

	@Override
	public boolean addWlrenshi(Wlrenshi wlrenshi) {
		// TODO Auto-generated method stub
		return wlrenshiDao.addWlrenshi(wlrenshi);
	}

	@Override
	public boolean deleteWlrenshi(Wlrenshi wlrenshi) {
		// TODO Auto-generated method stub
		return wlrenshiDao.deleteWlrenshi(wlrenshi);
	}

	@Override
	public boolean updataWlrenshi(Wlrenshi wlrenshi) {
		// TODO Auto-generated method stub
		return wlrenshiDao.updataWlrenshi(wlrenshi);
	}
	


}
