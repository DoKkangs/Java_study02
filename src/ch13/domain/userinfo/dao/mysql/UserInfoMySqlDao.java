package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySql DB userID = "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySql DB userID = "+userInfo.getUserId());

	}

	@Override
	public void deleteInfo(UserInfo userInfo) {
		System.out.println("Delete from MySql DB userID = "+userInfo.getUserId());

	}
	

}
