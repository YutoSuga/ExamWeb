package jp.co.axiz.web.service;

import java.sql.Connection;
import java.util.ArrayList;

import jp.co.axiz.web.dao.UserDao;
import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.util.DbUtil;

public class SelectService {

	public static ArrayList<UserEntity> saearchAllService() {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findAll();
	}
	public static ArrayList<UserEntity> saearchNameService(String name) {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findName(name);
	}
	public static ArrayList<UserEntity> saearchTelService(String tel) {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findTel(tel);
	}
	public static ArrayList<UserEntity> saearchNameTelService(String name,String tel) {
		System.out.println("Serviceなう");
		Connection conn = DbUtil.getConnection();
		UserDao dao = new UserDao(conn);
		return dao.findNameTel(name,tel);
	}
}
