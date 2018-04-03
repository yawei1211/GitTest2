package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Shouhuoren;
import org.logistics.bean.Wlbumen;

public interface ShouhuorenDao {

	public List<Shouhuoren> getAllshouhuoren();
	public boolean addShouhuoren(Shouhuoren shouhuoren);
	public boolean deleteShouhuoren(Shouhuoren shouhuoren);
	public boolean updataShouhuoren(Shouhuoren shouhuoren);
}
