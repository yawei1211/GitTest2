package org.logistics.service;

import java.util.List;

import org.logistics.bean.Outputinfo;

public interface OutputinfoService {

	public List<Outputinfo> getAlloutputinfo();
	public boolean addOutputinfo(Outputinfo outputinfo);
	public boolean deleteOutputinfo(Outputinfo outputinfo);
	public boolean updataOutputinfo(Outputinfo outputinfo);
}
