package org.logistics.service.impl;

import java.util.List;

import org.logistics.bean.Outputinfo;
import org.logistics.dao.OutputinfoDao;
import org.logistics.service.OutputinfoService;

public class OutputinfoServiceImpl implements OutputinfoService{

	private OutputinfoDao outputinfoDao;
	
	public void setOutputinfoDao(OutputinfoDao outputinfoDao) {
		this.outputinfoDao = outputinfoDao;
	}

	@Override
	public List<Outputinfo> getAlloutputinfo() {
		// TODO Auto-generated method stub
		return outputinfoDao.getAlloutputinfo();
	}

	@Override
	public boolean addOutputinfo(Outputinfo outputinfo) {
		// TODO Auto-generated method stub
		return outputinfoDao.addOutputinfo(outputinfo);
	}

	@Override
	public boolean deleteOutputinfo(Outputinfo outputinfo) {
		// TODO Auto-generated method stub
		return outputinfoDao.deleteOutputinfo(outputinfo);
	}

	@Override
	public boolean updataOutputinfo(Outputinfo outputinfo) {
		// TODO Auto-generated method stub
		return outputinfoDao.updataOutputinfo(outputinfo);
	}

}
