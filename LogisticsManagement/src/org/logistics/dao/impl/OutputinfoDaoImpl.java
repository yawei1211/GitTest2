package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Outputinfo;
import org.logistics.bean.Wluser;
import org.logistics.dao.OutputinfoDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class OutputinfoDaoImpl implements OutputinfoDao {
	
	private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Outputinfo> getAlloutputinfo() {
		List<Outputinfo> outputinfo=(List<Outputinfo>) hibernateTemplate.find("from Outputinfo");
		return outputinfo;
	}

	@Override
	public boolean addOutputinfo(Outputinfo outputinfo) {
		hibernateTemplate.save(outputinfo);
		return true;
	}

	@Override
	public boolean deleteOutputinfo(Outputinfo outputinfo) {
		hibernateTemplate.delete(outputinfo);
		return true;
	}

	@Override
	public boolean updataOutputinfo(Outputinfo outputinfo) {
		hibernateTemplate.saveOrUpdate(outputinfo);
		return true;
	}

	
}
