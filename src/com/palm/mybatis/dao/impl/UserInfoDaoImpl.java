package com.palm.mybatis.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.palm.mybatis.dao.UserInfoDao;
import com.palm.mybatis.vo.UserInfoVO;

/**
 * UserDao接口实现
 * 
 * @author weixiang.qin
 * 
 */
public class UserInfoDaoImpl implements UserInfoDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertUserInfoVO(UserInfoVO userVO) {
		sqlSessionTemplate.insert("UserInfoVO.insertUserInfoVO", userVO);
	}

	@Override
	public UserInfoVO queryUserInfoVOByUserId(String userId) {
		return sqlSessionTemplate.selectOne("UserInfoVO.queryUserInfoVOByUserId", userId);
	}

	@Override
	public List<UserInfoVO> queryUserInfoVOsByPage(int from, int size) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("from", from);
		params.put("size", size);
		return sqlSessionTemplate.selectList("UserInfoVO.queryUserInfoVOsByPage", params);
	}
	
	@Override
	public List<UserInfoVO> queryUsesrInfoVOsByMobile(String mobile) {
		return sqlSessionTemplate.selectList("UserInfoVO.queryUsesrInfoVOsByMobile", mobile);
	}

	@Override
	public int updateStatusByUserId(String userId, int status) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		params.put("status", status);
		return sqlSessionTemplate.update("UserInfoVO.updateStatusByUserId", params);
	}


}
