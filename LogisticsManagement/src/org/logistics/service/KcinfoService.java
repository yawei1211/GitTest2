package org.logistics.service;

import java.util.List;

import org.logistics.bean.Kcinfo;

public interface KcinfoService {

	public List<Kcinfo> getAlloutputinfo();
	public boolean addKcinfo(Kcinfo kcinfo);
	public boolean deleteKcinfo(Kcinfo kcinfo);
	public boolean updataKcinfo(Kcinfo kcinfo);
}
