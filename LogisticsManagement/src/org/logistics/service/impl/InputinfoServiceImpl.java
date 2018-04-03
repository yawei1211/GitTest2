package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Inputinfo;
import org.logistics.dao.InputinfoDao;
import org.logistics.service.InputinfoService;

public class InputinfoServiceImpl implements InputinfoService{

	private InputinfoDao inputonfoDao;
	
	public void setInputonfoDao(InputinfoDao inputonfoDao) {
		this.inputonfoDao = inputonfoDao;
	}

	@Override
	public List<Inputinfo> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return inputonfoDao.getAlloutputinfo();
	}

	@Override
	public boolean addInputinfo(Inputinfo inputinfo) {
		// TODO Auto-generated method stub
		return inputonfoDao.addInputinfo(inputinfo);
	}

	@Override
	public boolean deleteInputinfo(Inputinfo inputinfo) {
		// TODO Auto-generated method stub
		return inputonfoDao.deleteInputinfo(inputinfo);
	}

	@Override
	public boolean updataInputinfo(Inputinfo inputinfo) {
		// TODO Auto-generated method stub
		return inputonfoDao.updataInputinfo(inputinfo);
	}

}
