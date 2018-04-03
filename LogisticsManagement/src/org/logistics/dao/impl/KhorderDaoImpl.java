package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Khorder;

import org.logistics.dao.KhorderDao;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class KhorderDaoImpl implements KhorderDao {
	
    private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Khorder> getAlloutputinfo() {
		List<Khorder> khorder=(List<Khorder>) hibernateTemplate.find("from Khorder");
		return khorder;
	}

	@Override
	public boolean addKhorder(Khorder khorder) {
		hibernateTemplate.save(khorder);
		return true;
	}

	@Override
	public boolean deleteKhorder(Khorder khorder) {
		hibernateTemplate.delete(khorder);
		return true;
	}

	@Override
	public boolean updataKhorder(Khorder khorder) {
		hibernateTemplate.saveOrUpdate(khorder);
		return true;
	}

	
}
