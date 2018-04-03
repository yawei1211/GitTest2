package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Wlbumen;
import org.logistics.dao.WlbumenDao;
import org.logistics.service.WlbumenService;

public class WlbumenServiceImpl implements WlbumenService{

	private WlbumenDao wlbumenDao;
	
	public void setWlbumenDao(WlbumenDao wlbumenDao) {
		this.wlbumenDao = wlbumenDao;
	}

	@Override
	public List<Wlbumen> getAllbumen() {
		// TODO Auto-generated method stub
		return wlbumenDao.getAllbumen();
	}

	@Override
	public boolean addWlbumen(Wlbumen wlbumen) {
		// TODO Auto-generated method stub
		return wlbumenDao.addWlbumen(wlbumen);
	}

	@Override
	public boolean deleteWlbumen(Wlbumen wlbumen) {
		// TODO Auto-generated method stub
		return wlbumenDao.deleteWlbumen(wlbumen);
	}

	@Override
	public boolean updataWlbumen(Wlbumen wlbumen) {
		// TODO Auto-generated method stub
		return wlbumenDao.updataWlbumen(wlbumen);
	}

}
