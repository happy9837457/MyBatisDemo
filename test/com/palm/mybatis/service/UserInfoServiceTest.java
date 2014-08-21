package com.palm.mybatis.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.palm.mybatis.bean.UserInfo;
import com.palm.mybatis.util.SpringHelper;

public class UserInfoServiceTest {
	private UserInfoService userInfoService;

	@Before
	public void setUp() throws Exception {
		userInfoService = SpringHelper.getBean("userInfoService");
	}

	@Test
	public void testInsertUser() {
		UserInfo userVO = new UserInfo();
		userVO.setUserName("username");
		userVO.setUserPwd("userpwd");
		userVO.setStatus(0);
		userInfoService.insertUserInfo(userVO);
	}

	@Test
	public void testQueryUserByUserId() {
		String userId = "10000";
		UserInfo userVO = userInfoService.queryUserInfoByUserId(userId);
		System.out.println(userVO.getUserName());
	}

	@Test
	public void testQueryUsersByPage() {
		int from = 0;
		int size = 20;
		List<UserInfo> userVOs = userInfoService.queryUserInfosByPage(from, size);
		System.out.println(userVOs.size());
	}
	
	@Test
	public void testQueryUsesrInfosByMobile(){
		String mobile = "";
		List<UserInfo> userInfoVOs = userInfoService.queryUsesrInfosByMobile(mobile);
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
