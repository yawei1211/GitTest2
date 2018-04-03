package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Outputinfo;
import org.logistics.bean.Shouhuoren;

public interface OutputinfoDao {

	public List<Outputinfo> getAlloutputinfo();
	public boolean addOutputinfo(Outputinfo outputinfo);
	public boolean deleteOutputinfo(Outputinfo outputinfo);
	public boolean updataOutputinfo(Outputinfo outputinfo);
}
