package com.palm.mybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palm.mybatis.bean.UserInfo;
import com.palm.mybatis.dao.UserInfoDao;
import com.palm.mybatis.service.UserInfoService;

/**
 * UserService接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
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

	@Transactional
	@Override
	public int updateStatusByUserId(String userId, int status) {
		return userInfoDao.updateStatusByUserId(userId, status);
	}

}
