package org.logistics.service;

import java.util.List;

import org.logistics.bean.Shouhuoren;

public interface ShouhuorenService {

	public List<Shouhuoren> getAllshouhuoren();
	public boolean addShouhuoren(Shouhuoren shouhuoren);
	public boolean deleteShouhuoren(Shouhuoren shouhuoren);
	public boolean updataShouhuoren(Shouhuoren shouhuoren);
}
