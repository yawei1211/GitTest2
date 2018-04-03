package org.logistics.service;

import java.util.List;

import org.logistics.bean.Khinfo;

public interface KhinfoService {

	public List<Khinfo> getAlloutputinfo();
	public boolean addKhinfo(Khinfo khinfo);
	public boolean deleteKhinfo(Khinfo khinfo);
	public boolean updataKhinfo(Khinfo khinfo);
}
