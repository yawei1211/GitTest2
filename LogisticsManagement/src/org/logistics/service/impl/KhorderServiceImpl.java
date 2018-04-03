package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Khorder;
import org.logistics.dao.KhorderDao;
import org.logistics.service.KhorderService;

public class KhorderServiceImpl implements KhorderService{

	private KhorderDao khorderDao;
	
	public void setKhorderDao(KhorderDao khorderDao) {
		this.khorderDao = khorderDao;
	}

	@Override
	public List<Khorder> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return khorderDao.getAlloutputinfo();
	}

	@Override
	public boolean addKhorder(Khorder khorder) {
		// TODO Auto-generated method stub
		return khorderDao.addKhorder(khorder);
	}

	@Override
	public boolean deleteKhorder(Khorder khorder) {
		// TODO Auto-generated method stub
		return khorderDao.deleteKhorder(khorder);
	}

	@Override
	public boolean updataKhorder(Khorder khorder) {
		// TODO Auto-generated method stub
		return khorderDao.updataKhorder(khorder);
	}

}
