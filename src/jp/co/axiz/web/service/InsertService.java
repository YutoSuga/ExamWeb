package jp.co.axiz.web.service;

import java.sql.Connection;

import jp.co.axiz.web.dao.UserDao;
import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.util.DbUtil;

public class InsertService {

	public static UserEntity searchLogin(String id) {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findLogin(id);
	}

	public static void insert(String loginId,String userName,String tel,String roleName,String pass) {
		System.out.println("ServiceInsert入りました");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		int roleId = 0;
		if (roleName.equals("管理者")) {
			roleId = 1;
		} else {
			roleId = 2;
		}
		dao.insert(loginId,userName,tel,roleId,pass);
	}
}
