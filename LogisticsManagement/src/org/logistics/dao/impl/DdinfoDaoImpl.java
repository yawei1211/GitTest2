package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Ddinfo;
import org.logistics.bean.Wluser;
import org.logistics.dao.DdinfoDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class DdinfoDaoImpl implements DdinfoDao {
	private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Ddinfo> getAlloutputinfo() {
		List<Ddinfo> ddinfo=(List<Ddinfo>) hibernateTemplate.find("from Ddinfo");
		return ddinfo;
	}

	@Override
	public boolean addDdinfo(Ddinfo ddinfo) {
		hibernateTemplate.save(ddinfo);
		return true;
	}

	@Override
	public boolean deleteDdinfo(Ddinfo ddinfo) {
		hibernateTemplate.delete(ddinfo);
		return true;
	}

	@Override
	public boolean updataDdinfo(Ddinfo ddinfo) {

		hibernateTemplate.saveOrUpdate(ddinfo);
		return true;
	}



}
