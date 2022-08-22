package com.lms.model.persistence.helper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lms.bean.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		User user=new User(resultSet.getString("email"), resultSet.getString("pass"),resultSet.getInt("type"));
		return user;
	}
}
