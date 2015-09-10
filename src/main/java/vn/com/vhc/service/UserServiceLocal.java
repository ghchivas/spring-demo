package vn.com.vhc.service;

import java.util.List;

import vn.com.vhc.domain.User;

public interface UserServiceLocal {

	User getByUserId(Integer id);
	
	List<User> getAll();
}