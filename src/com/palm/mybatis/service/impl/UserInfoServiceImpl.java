package com.palm.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.palm.mybatis.bean.UserInfo;
import com.palm.mybatis.dao.UserInfoDao;
import com.palm.mybatis.service.UserInfoService;

/**
 * UserService接口实现
 * 
 * @author weixiang.qin
 * 
 */
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		userInfoDao.insertUserInfo(userInfo);
	}

	@Override
	public UserInfo queryUserInfoByUserId(String userId) {
		return userInfoDao.queryUserInfoByUserId(userId);
	}

	@Override
	public List<UserInfo> queryUserInfosByPage(int from, int size) {
		return userInfoDao.queryUserInfosByPage(from, size);
	}

	@Override
	public List<UserInfo> queryUsesrInfosByMobile(String mobile) {
		return userInfoDao.queryUsesrInfosByMobile(mobile);
	}

	@Override
	public int updateStatusByUserId(String userId, int status) {
		return userInfoDao.updateStatusByUserId(userId, status);
	}

}