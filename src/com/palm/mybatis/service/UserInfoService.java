package com.palm.mybatis.service;

import java.util.List;

import com.palm.mybatis.vo.UserInfoVO;

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
	public void insertUserInfoVO(UserInfoVO userInfoVO);

	/**
	 * 通过userId查询
	 * 
	 * @param userId
	 * @return
	 */
	public UserInfoVO queryUserInfoVOByUserId(String userId);

	/**
	 * 分页查询
	 * 
	 * @param from
	 * @param size
	 * @return
	 */
	public List<UserInfoVO> queryUserInfoVOsByPage(int from, int size);
	
	/**
	 * 通过userId更新status
	 * 
	 * @param userId
	 * @param status
	 * @return
	 */
	public int updateStatusByUserId(String userId, int status);
}
