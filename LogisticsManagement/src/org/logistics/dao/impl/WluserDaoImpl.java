package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Wluser;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class WluserDaoImpl implements WluserDao {
	private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Wluser> getAlluser() {
		List<Wluser> wluser=(List<Wluser>) hibernateTemplate.find("from Wluser");
		return wluser;
	}

	@Override
	public boolean addWluser(Wluser wluser) {
		hibernateTemplate.save(wluser);
		return true;
	}

	@Override
	public boolean deleteWluser(Wluser wluser) {
		hibernateTemplate.delete(wluser);
		return true;
	}

	@Override
	public boolean updataWluser(Wluser wluser) {
		hibernateTemplate.saveOrUpdate(wluser);
		return true;
	}

	@Override
	public List<Wluser> getAllWluserByPageAndRows(int page, int rows) {
		 List<Wluser> detail = (List<Wluser>) hibernateTemplate.find("from Wluser").subList((page-1)*rows, page*rows);
			
		return detail;
	}

}
