package com.admindao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Admin;

@Transactional
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String LoginCheck(Admin a) {
		
		Session s = sessionFactory.getCurrentSession();
		Admin x = (Admin) s.createQuery("from Admin a where a.adminEmail='"+a.getAdminEmail()+"' and a.adminPass='"+a.getAdminPass()+"' ").uniqueResult();

		return x.getAdminEmail();
	}

}
