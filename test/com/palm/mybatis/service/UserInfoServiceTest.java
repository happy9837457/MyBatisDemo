package com.palm.mybatis.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.mybatis.util.SpringHelper;
import com.palm.mybatis.vo.UserInfoVO;

public class UserInfoServiceTest {
	private UserInfoService userInfoService;

	@Before
	public void setUp() throws Exception {
		userInfoService = SpringHelper.getBean("userInfoService");
	}

	@Test
	public void testInsertUserVO() {
		UserInfoVO userVO = new UserInfoVO();
		userVO.setUserName("username");
		userVO.setUserPwd("userpwd");
		userVO.setStatus(0);
		userInfoService.insertUserInfoVO(userVO);
	}

	@Test
	public void testQueryUserVOByUserId() {
		String userId = "10000";
		UserInfoVO userVO = userInfoService.queryUserInfoVOByUserId(userId);
		System.out.println(userVO.getUserName());
	}

	@Test
	public void testQueryUserVOsByPage() {
		int from = 0;
		int size = 20;
		List<UserInfoVO> userVOs = userInfoService.queryUserInfoVOsByPage(from, size);
		System.out.println(userVOs.size());
	}
	
	@Test
	public void testQueryUsesrInfoVOsByMobile(){
		String mobile = "";
		List<UserInfoVO> userInfoVOs = userInfoService.queryUsesrInfoVOsByMobile(mobile);
		System.out.println(userInfoVOs.size());
	}

	@Test
	public void testUpdateStatusByUserId() {
		String userId = "10000";
		int status = 1;
		int updateRow = userInfoService.updateStatusByUserId(userId, status);
		System.out.println("updateRow:" + updateRow);
	}

	@After
	public void tearDown() throws Exception {
	}

}
