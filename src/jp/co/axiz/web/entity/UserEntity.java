package jp.co.axiz.web.entity;


//user_infoテーブルのEntity
public class UserEntity {
	//カラム名のフィールド
	Integer userId;
	String loginId;
	String userName;
	String telephone;
	String password;
	Integer roleId;
	String roleName;

	public UserEntity() {

	}
	public UserEntity(Integer userId, String loginId, String userName, String telephone, String password,
			Integer roleId) {
		this.userId = userId;
		this.loginId = loginId;
		this.userName = userName;
		this.telephone = telephone;
		this.password = password;
		this.roleId = roleId;

	}
	public UserEntity(Integer userId, String loginId, String userName, String telephone, String password,
			String roleName) {
		this.userId = userId;
		this.loginId = loginId;
		this.userName = userName;
		this.telephone = telephone;
		this.password = password;
		this.roleName = roleName;

	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


}
