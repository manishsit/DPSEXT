package org.dps.value.login;

import java.util.List;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class LoginValue {

	private String accountId;
	private String userId;
	private String userPassword;
	private List<UserRoleValue> userRoleList;

	public LoginValue() {

	}

	public void finalize() throws Throwable {

	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<UserRoleValue> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRoleValue> userRoleList) {
		this.userRoleList = userRoleList;
	}

}