package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Wlrenshi;
import org.logistics.bean.Wluser;
import org.logistics.dao.WlrenshiDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class WlrenshiDaoImpl implements WlrenshiDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Wlrenshi> getAllrenshi() {
		List<Wlrenshi> wlrenshi=(List<Wlrenshi>) hibernateTemplate.find("from Wlrenshi");
		return wlrenshi;
	}

	@Override
	public boolean addWlrenshi(Wlrenshi wlrenshi) {
		hibernateTemplate.save(wlrenshi);
		return true;
	}

	@Override
	public boolean deleteWlrenshi(Wlrenshi wlrenshi) {
		hibernateTemplate.save(wlrenshi);
		return true;
	}

	@Override
	public boolean updataWlrenshi(Wlrenshi wlrenshi) {
		hibernateTemplate.saveOrUpdate(wlrenshi);
		return true;
	}

	

}
