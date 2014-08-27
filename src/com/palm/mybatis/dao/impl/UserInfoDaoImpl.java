package com.palm.mybatis.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.palm.mybatis.bean.UserInfo;
import com.palm.mybatis.dao.UserInfoDao;

/**
 * UserDao接口实现
 * 
 * @author weixiang.qin
 * 
 */
@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		sqlSessionTemplate.insert("UserInfo.insertUserInfo", userInfo);
	}

	@Override
	public UserInfo queryUserInfoByUserId(String userId) {
		return sqlSessionTemplate.selectOne("UserInfo.queryUserInfoByUserId", userId);
	}

	@Override
	public List<UserInfo> queryUserInfosByPage(int from, int size) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("from", from);
		params.put("size", size);
		return sqlSessionTemplate.selectList("UserInfo.queryUserInfosByPage", params);
	}
	
	@Override
	public List<UserInfo> queryUsesrInfosByMobile(String mobile) {
		return sqlSessionTemplate.selectList("UserInfo.queryUsesrInfosByMobile", mobile);
	}

	@Override
	public int updateStatusByUserId(String userId, int status) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		params.put("status", status);
		return sqlSessionTemplate.update("UserInfo.updateStatusByUserId", params);
	}


}
