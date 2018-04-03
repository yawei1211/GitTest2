package org.logistics.dao;

import java.util.List;

import org.logistics.bean.Kcinfo;
import org.logistics.bean.Khorder;

public interface KhorderDao {

	public List<Khorder> getAlloutputinfo();
	public boolean addKhorder(Khorder khorder);
	public boolean deleteKhorder(Khorder khorder);
	public boolean updataKhorder(Khorder khorder);
}
