package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Wlbumen;
import org.logistics.dao.WlbumenDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class WlbumenDaoImpl implements WlbumenDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Wlbumen> getAllbumen() {
		List<Wlbumen> wlbumen=(List<Wlbumen>) hibernateTemplate.find("from Wlbumen");
		return wlbumen;
	}

	@Override
	public boolean addWlbumen(Wlbumen wlbumen) {
		hibernateTemplate.save(wlbumen);
		return true;
	}

	@Override
	public boolean deleteWlbumen(Wlbumen wlbumen) {
		hibernateTemplate.delete(wlbumen);
		return true;
	}

	@Override
	public boolean updataWlbumen(Wlbumen wlbumen) {
		hibernateTemplate.saveOrUpdate(wlbumen);
		return true;
	}

	
}
