package org.logistics.service;

import java.util.List;

import org.logistics.bean.Inputinfo;

public interface InputinfoService {

	public List<Inputinfo> getAlloutputinfo();
	public boolean addInputinfo(Inputinfo inputinfo);
	public boolean deleteInputinfo(Inputinfo inputinfo);
	public boolean updataInputinfo(Inputinfo inputinfo);
}
