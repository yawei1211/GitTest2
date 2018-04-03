package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Ddinfo;
import org.logistics.dao.DdinfoDao;
import org.logistics.service.DdinfoService;

public class DdinfoServiceImpl implements DdinfoService{

	private DdinfoDao ddinfoDao;
	public void setDdinfoDao(DdinfoDao ddinfoDao) {
		this.ddinfoDao = ddinfoDao;
	}

	@Override
	public List<Ddinfo> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return ddinfoDao.getAlloutputinfo();
	}

	@Override
	public boolean addDdinfo(Ddinfo ddinfo) {
		// TODO Auto-generated method stub
		return ddinfoDao.addDdinfo(ddinfo);
	}

	@Override
	public boolean deleteDdinfo(Ddinfo ddinfo) {
		// TODO Auto-generated method stub
		return ddinfoDao.deleteDdinfo(ddinfo);
	}

	@Override
	public boolean updataDdinfo(Ddinfo ddinfo) {
		// TODO Auto-generated method stub
		return ddinfoDao.updataDdinfo(ddinfo);
	}

}
