package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Khinfo;
import org.logistics.dao.KhinfoDao;
import org.logistics.service.KhinfoService;

public class KhinfoServiceImpl implements KhinfoService{

	private KhinfoDao khinfoDao;
	public void setKhinfoDao(KhinfoDao khinfoDao) {
		this.khinfoDao = khinfoDao;
	}

	@Override
	public List<Khinfo> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return khinfoDao.getAlloutputinfo();
	}

	@Override
	public boolean addKhinfo(Khinfo khinfo) {
		// TODO Auto-generated method stub
		return khinfoDao.addKhinfo(khinfo);
	}

	@Override
	public boolean deleteKhinfo(Khinfo khinfo) {
		// TODO Auto-generated method stub
		return khinfoDao.deleteKhinfo(khinfo);
	}

	@Override
	public boolean updataKhinfo(Khinfo khinfo) {
		// TODO Auto-generated method stub
		return khinfoDao.updataKhinfo(khinfo);
	}

}
