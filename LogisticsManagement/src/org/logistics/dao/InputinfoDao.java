package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Inputinfo;
import org.logistics.bean.Khinfo;

public interface InputinfoDao {

	public List<Inputinfo> getAlloutputinfo();
	public boolean addInputinfo(Inputinfo inputinfo);
	public boolean deleteInputinfo(Inputinfo inputinfo);
	public boolean updataInputinfo(Inputinfo inputinfo);
}
