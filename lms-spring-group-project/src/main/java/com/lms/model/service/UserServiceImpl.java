package com.lms.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lms.bean.User;
import com.lms.model.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public boolean checkUser(User user) {
		if(userDao.getUser(user.getEmail(), user.getPass())!=null)
			return true;
		return false;
	}

	@Override
	public int checkAdmin(User user) {
		return userDao.checkAdminCtrl(user.getEmail(),user.getPass());
	}




}
