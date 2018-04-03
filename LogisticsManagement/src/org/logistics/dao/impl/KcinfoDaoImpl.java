package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Kcinfo;
import org.logistics.bean.Wluser;
import org.logistics.dao.KcinfoDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class KcinfoDaoImpl implements KcinfoDao {

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Kcinfo> getAlloutputinfo() {
		List<Kcinfo> kcinfo=(List<Kcinfo>) hibernateTemplate.find("from Kcinfo");
		
		return kcinfo;
	}

	@Override
	public boolean addKcinfo(Kcinfo kcinfo) {
		hibernateTemplate.save(kcinfo);
		return true;
	}

	@Override
	public boolean deleteKcinfo(Kcinfo kcinfo) {
		hibernateTemplate.delete(kcinfo);
		
		return true;
	}

	@Override
	public boolean updataKcinfo(Kcinfo kcinfo) {
		hibernateTemplate.save(kcinfo);
		return true;
	}

	
}
