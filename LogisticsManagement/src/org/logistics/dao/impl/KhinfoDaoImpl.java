package org.logistics.dao.impl;

import java.util.List;

import org.logistics.bean.Khinfo;
import org.logistics.bean.Wluser;
import org.logistics.dao.KhinfoDao;
import org.logistics.dao.WluserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class KhinfoDaoImpl implements KhinfoDao {
	    private HibernateTemplate hibernateTemplate;
		
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}

	@Override
	public List<Khinfo> getAlloutputinfo() {
		List<Khinfo> khinfo=(List<Khinfo>) hibernateTemplate.find("from Khinfo");
		return khinfo;
	}

	@Override
	public boolean addKhinfo(Khinfo khinfo) {
		hibernateTemplate.save(khinfo);
		return true;
	}

	@Override
	public boolean deleteKhinfo(Khinfo khinfo) {
		hibernateTemplate.delete(khinfo);
		return true;
	}

	@Override
	public boolean updataKhinfo(Khinfo khinfo) {
		hibernateTemplate.saveOrUpdate(khinfo);
		return true;
	}

	

}
