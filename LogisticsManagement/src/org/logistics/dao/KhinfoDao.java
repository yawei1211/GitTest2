package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Khinfo;
import org.logistics.bean.Khorder;

public interface KhinfoDao {

	
	public List<Khinfo> getAlloutputinfo();
	public boolean addKhinfo(Khinfo khinfo);
	public boolean deleteKhinfo(Khinfo khinfo);
	public boolean updataKhinfo(Khinfo khinfo);
}
