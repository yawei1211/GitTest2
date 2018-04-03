package org.logistics.service;

import java.util.List;

import org.logistics.bean.Wlbumen;

public interface WlbumenService {

	public List<Wlbumen> getAllbumen();
	public boolean addWlbumen(Wlbumen wlbumen);
	public boolean deleteWlbumen(Wlbumen wlbumen);
	public boolean updataWlbumen(Wlbumen wlbumen);
}
