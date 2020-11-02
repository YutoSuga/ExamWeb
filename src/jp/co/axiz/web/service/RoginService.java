package jp.co.axiz.web.service;

import java.sql.Connection;

import jp.co.axiz.web.dao.UserDao;
import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.util.DbUtil;

public class RoginService {
	public static UserEntity RoginService(String id, String pass) {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findById(id, pass);
	}

}
