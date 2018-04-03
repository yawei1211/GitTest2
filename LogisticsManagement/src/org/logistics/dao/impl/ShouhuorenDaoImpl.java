package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Shouhuoren;
import org.logistics.bean.Wluser;
import org.logistics.dao.ShouhuorenDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ShouhuorenDaoImpl implements ShouhuorenDao {
	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Shouhuoren> getAllshouhuoren() {
		List<Shouhuoren> shouhuoren=(List<Shouhuoren>) hibernateTemplate.find("from Shouhuoren");
		return shouhuoren;
	}

	@Override
	public boolean addShouhuoren(Shouhuoren shouhuoren) {
		hibernateTemplate.save(shouhuoren);
		return true;
	}

	@Override
	public boolean deleteShouhuoren(Shouhuoren shouhuoren) {
		hibernateTemplate.delete(shouhuoren);;
		return true;
	}

	@Override
	public boolean updataShouhuoren(Shouhuoren shouhuoren) {
		hibernateTemplate.saveOrUpdate(shouhuoren);
		return true;
	}

	

}
