package com.palm.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.palm.mybatis.dao.UserInfoDao;
import com.palm.mybatis.service.UserInfoService;
import com.palm.mybatis.vo.UserInfoVO;

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
	public void insertUserInfoVO(UserInfoVO userInfoVO) {
		userInfoDao.insertUserInfoVO(userInfoVO);
	}

	@Override
	public UserInfoVO queryUserInfoVOByUserId(String userId) {
		return userInfoDao.queryUserInfoVOByUserId(userId);
	}

	@Override
	public List<UserInfoVO> queryUserInfoVOsByPage(int from, int size) {
		return userInfoDao.queryUserInfoVOsByPage(from, size);
	}

	@Override
	public int updateStatusByUserId(String userId, int status) {
		return userInfoDao.updateStatusByUserId(userId, status);
	}
	
}
