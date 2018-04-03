package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Shouhuoren;
import org.logistics.dao.ShouhuorenDao;
import org.logistics.service.ShouhuorenService;

public class ShouhuorenServiceImpl implements ShouhuorenService{

	private ShouhuorenDao shouhuorenDao;
	
	public void setShouhuorenDao(ShouhuorenDao shouhuorenDao) {
		this.shouhuorenDao = shouhuorenDao;
	}

	@Override
	public List<Shouhuoren> getAllshouhuoren() {
		// TODO Auto-generated method stub
		return shouhuorenDao.getAllshouhuoren();
	}

	@Override
	public boolean addShouhuoren(Shouhuoren shouhuoren) {
		// TODO Auto-generated method stub
		return shouhuorenDao.addShouhuoren(shouhuoren);
	}

	@Override
	public boolean deleteShouhuoren(Shouhuoren shouhuoren) {
		// TODO Auto-generated method stub
		return shouhuorenDao.deleteShouhuoren(shouhuoren);
	}

	@Override
	public boolean updataShouhuoren(Shouhuoren shouhuoren) {
		// TODO Auto-generated method stub
		return shouhuorenDao.updataShouhuoren(shouhuoren);
	}

}
