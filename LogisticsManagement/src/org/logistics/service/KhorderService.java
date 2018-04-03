package org.logistics.service;

import java.util.List;

import org.logistics.bean.Khorder;

public interface KhorderService {

	public List<Khorder> getAlloutputinfo();
	public boolean addKhorder(Khorder khorder);
	public boolean deleteKhorder(Khorder khorder);
	public boolean updataKhorder(Khorder khorder);
}
