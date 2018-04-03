package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Wlbumen;
import org.logistics.bean.Wlrenshi;

public interface WlbumenDao {

	public List<Wlbumen> getAllbumen();
	public boolean addWlbumen(Wlbumen wlbumen);
	public boolean deleteWlbumen(Wlbumen wlbumen);
	public boolean updataWlbumen(Wlbumen wlbumen);
}
