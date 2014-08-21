package com.palm.mybatis.service;

import java.util.List;

import com.palm.mybatis.bean.UserInfo;

/**
 * UserInfoService接口
 * 
 * @author weixiang.qin
 * 
 */
public interface UserInfoService {
	/**
	 * 插入
	 * 
	 * @param userVO
	 */
	public void insertUserInfo(UserInfo userInfoVO);

	/**
	 * 通过userId查询
	 * 
	 * @param userId
	 * @return
	 */
	public UserInfo queryUserInfoByUserId(String userId);

	/**
	 * 分页查询
	 * 
	 * @param from
	 * @param size
	 * @return
	 */
	public List<UserInfo> queryUserInfosByPage(int from, int size);

	/**
	 * 通过mobile查询
	 * 
	 * @param mobile
	 * @return
	 */
	public List<UserInfo> queryUsesrInfosByMobile(String mobile);

	/**
	 * 通过userId更新status
	 * 
	 * @param userId
	 * @param status
	 * @return
	 */
	public int updateStatusByUserId(String userId, int status);
}
