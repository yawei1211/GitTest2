package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Ddinfo;
import org.logistics.bean.Inputinfo;

public interface DdinfoDao {

	public List<Ddinfo> getAlloutputinfo();
	public boolean addDdinfo(Ddinfo ddinfo);
	public boolean deleteDdinfo(Ddinfo ddinfo);
	public boolean updataDdinfo(Ddinfo ddinfo);
}
