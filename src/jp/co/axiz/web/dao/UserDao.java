package jp.co.axiz.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.axiz.web.entity.UserEntity;

public class UserDao {

	private static String SQL_SELECT_ID = "SELECT * FROM user_info WHERE login_id=? and password=?";
	private static String SQL_SELECT_ALL = "SELECT * FROM user_info join role on user_info.role_id=role.role_id ";
	private static String SQL_SELECT_NAME = "SELECT * FROM user_info join role on user_info.role_id=role.role_id WHERE user_name = ?";
	private static final String SQL_SELECT_TEL = "SELECT * FROM user_info join role on user_info.role_id=role.role_id WHERE telephone = ?";
	private static final String SQL_SELECT_NAME_TEL = "SELECT * FROM user_info join role on user_info.role_id=role.role_id WHERE user_name = ? and telephone = ?";
	private static final String SQL_SELECT_LOGIN = "SELECT * FROM user_info join role on user_info.role_id=role.role_id WHERE login_id = ? ";
	private static final String SQL_INSERT = "INSERT INTO user_info (login_id,user_name,telephone,role_id, password) VALUES (?,?,?,?,?)";

	private Connection connection;

	public UserDao(Connection connection) {
		this.connection = connection;
	}

	//IDとpass検索
	public UserEntity findById(String id, String pass) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ID)) {
			stmt.setString(1, id);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			System.out.println("Daoなう");
			if (rs.next()) {
				return new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getInt("role_name"));
			} else {
				System.out.println("daoのnullなう");
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//全検索
	public ArrayList<UserEntity> findAll() {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ALL)) {
			System.out.println("Dao2なう");
			ResultSet rs = stmt.executeQuery();
			ArrayList<UserEntity> entitys = new ArrayList<UserEntity>();
			while (rs.next()) {
				System.out.println("whileなう");
				UserEntity e = new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getString("role_name"));
				entitys.add(e);
			}
			return entitys;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayList<UserEntity> findName(String name) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_NAME)) {
			stmt.setString(1, name);
			System.out.println("Dao3なう");
			ResultSet rs = stmt.executeQuery();
			ArrayList<UserEntity> entitys = new ArrayList<UserEntity>();
			while (rs.next()) {
				System.out.println("whileなう");
				UserEntity e = new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getString("role_name"));
				entitys.add(e);
			}
			return entitys;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayList<UserEntity> findTel(String tel) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_TEL)) {
			stmt.setString(1, tel);
			System.out.println("Dao2なう");
			ResultSet rs = stmt.executeQuery();
			ArrayList<UserEntity> entitys = new ArrayList<UserEntity>();
			while (rs.next()) {
				System.out.println("whileなう");
				UserEntity e = new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getString("role_name"));
				entitys.add(e);
			}
			return entitys;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ArrayList<UserEntity> findNameTel(String name, String tel) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_NAME_TEL)) {
			stmt.setString(1, name);
			stmt.setString(2, tel);
			System.out.println("Dao2なう");
			ResultSet rs = stmt.executeQuery();
			ArrayList<UserEntity> entitys = new ArrayList<UserEntity>();
			while (rs.next()) {
				System.out.println("whileなう");
				UserEntity e = new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getString("role_name"));
				entitys.add(e);
			}
			return entitys;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//ログインIDは一意性なので重複なし、リストじゃなくていいはず
	public UserEntity findLogin(String id) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_LOGIN)) {
			stmt.setString(1, id);
			System.out.println("Dao6なう");
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println("ifなう");
				return new UserEntity(rs.getInt("user_id"), rs.getString("login_id"), rs.getString("user_name"),
						rs.getString("telephone"), rs.getString("password"), rs.getString("role_name"));
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void insert(String loginId, String userName, String tel, int roleId, String pass) {
		System.out.println("insertDaoなう");
		try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
			System.out.println("tryなう");

			stmt.setString(1, loginId);
			stmt.setString(2, userName);
			stmt.setString(3, tel);
			stmt.setInt(4, roleId);
			stmt.setString(5, pass);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
