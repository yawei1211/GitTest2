package org.logistics.service;

import java.util.List;

import org.logistics.bean.Ddinfo;


public interface DdinfoService {

	public List<Ddinfo> getAlloutputinfo();
	public boolean addDdinfo(Ddinfo ddinfo);
	public boolean deleteDdinfo(Ddinfo ddinfo);
	public boolean updataDdinfo(Ddinfo ddinfo);
	

}
