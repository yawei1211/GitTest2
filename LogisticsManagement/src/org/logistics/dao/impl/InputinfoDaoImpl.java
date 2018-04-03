package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Inputinfo;
import org.logistics.bean.Wluser;
import org.logistics.dao.InputinfoDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class InputinfoDaoImpl implements InputinfoDao {
	private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Inputinfo> getAlloutputinfo() {
		List<Inputinfo> inputinfo=(List<Inputinfo>) hibernateTemplate.find("from Inputinfo");
		return inputinfo;
	}

	@Override
	public boolean addInputinfo(Inputinfo inputinfo) {
		hibernateTemplate.save(inputinfo);
		return true;
	}

	@Override
	public boolean deleteInputinfo(Inputinfo inputinfo) {
		hibernateTemplate.delete(inputinfo);
		return true;
	}

	@Override
	public boolean updataInputinfo(Inputinfo inputinfo) {
		hibernateTemplate.saveOrUpdate(inputinfo);
		return true;
	}

	
}
