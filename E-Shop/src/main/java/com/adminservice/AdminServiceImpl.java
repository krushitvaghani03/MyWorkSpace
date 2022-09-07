package com.adminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admindao.AdminDao;
import com.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	public String LoginCheck(Admin a) {

		return adminDao.LoginCheck(a);
	}

}
