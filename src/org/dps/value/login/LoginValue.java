package org.dps.value.login;

import java.io.Serializable;
import java.util.List;

import org.dps.value.common.BaseValue;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class LoginValue extends BaseValue implements Serializable {

	private static final long serialVersionUID = 4387500498058802154L;
	private String accountId;
	private String userEmail;
	private String userId;
	private String userPassword;
	private String userSecretAnswer;
	private String userSecretQuestion;
	private List<UserRoleValue> userRoleList;

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

	/**
	 * @return the userSecretAnswer
	 */
	public String getUserSecretAnswer() {
		return userSecretAnswer;
	}

	/**
	 * @param userSecretAnswer
	 *            the userSecretAnswer to set
	 */
	public void setUserSecretAnswer(String userSecretAnswer) {
		this.userSecretAnswer = userSecretAnswer;
	}

	/**
	 * @return the userSecretQuestion
	 */
	public String getUserSecretQuestion() {
		return userSecretQuestion;
	}

	/**
	 * @param userSecretQuestion
	 *            the userSecretQuestion to set
	 */
	public void setUserSecretQuestion(String userSecretQuestion) {
		this.userSecretQuestion = userSecretQuestion;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail
	 *            the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}