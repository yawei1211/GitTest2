package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Kcinfo;
import org.logistics.bean.Outputinfo;

public interface KcinfoDao {

	public List<Kcinfo> getAlloutputinfo();
	public boolean addKcinfo(Kcinfo kcinfo);
	public boolean deleteKcinfo(Kcinfo kcinfo);
	public boolean updataKcinfo(Kcinfo kcinfo);
}
