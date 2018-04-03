package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Kcinfo;
import org.logistics.dao.KcinfoDao;
import org.logistics.service.KcinfoService;

public class KcinfoServiceImpl implements KcinfoService{

	private KcinfoDao kcinfoDao;
	public void setKcinfoDao(KcinfoDao kcinfoDao) {
		this.kcinfoDao = kcinfoDao;
	}

	@Override
	public List<Kcinfo> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return kcinfoDao.getAlloutputinfo();
	}

	@Override
	public boolean addKcinfo(Kcinfo kcinfo) {
		// TODO Auto-generated method stub
		return kcinfoDao.addKcinfo(kcinfo);
	}

	@Override
	public boolean deleteKcinfo(Kcinfo kcinfo) {
		// TODO Auto-generated method stub
		return kcinfoDao.deleteKcinfo(kcinfo);
	}

	@Override
	public boolean updataKcinfo(Kcinfo kcinfo) {
		// TODO Auto-generated method stub
		return kcinfoDao.updataKcinfo(kcinfo);
	}

}
