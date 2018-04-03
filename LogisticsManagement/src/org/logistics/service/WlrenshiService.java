package org.logistics.service;

import java.util.List;

import org.logistics.bean.Wlrenshi;

public interface WlrenshiService {

	public List<Wlrenshi> getAllrenshi();
	public boolean addWlrenshi(Wlrenshi wlrenshi);
	public boolean deleteWlrenshi(Wlrenshi wlrenshi);
	public boolean updataWlrenshi(Wlrenshi wlrenshi);
}
