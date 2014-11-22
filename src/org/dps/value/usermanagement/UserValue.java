package org.dps.value.usermanagement;

import java.io.Serializable;

import org.dps.value.common.BaseValue;
import org.dps.value.login.LoginValue;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:31
 */
public class UserValue extends BaseValue implements Serializable {

	private static final long serialVersionUID = 7318584257214786561L;
	private String authoringLanguage = null;
	private String accountId = null;
	private String dateOfBirth = null;
	private String firstName = null;
	private boolean isProfilePicAvailable = false;
	private String lastName = null;
	private String profilePicPath = null;
	private String userContactNum = null;
	private String userCountry = null;
	private String userPhysicalAddress = null;
	private LoginValue loginValue = null;

	/**
	 * @return the authoringLanguage
	 */
	public String getAuthoringLanguage() {
		return authoringLanguage;
	}

	/**
	 * @param authoringLanguage
	 *            the authoringLanguage to set
	 */
	public void setAuthoringLanguage(String authoringLanguage) {
		this.authoringLanguage = authoringLanguage;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the isProfilePicAvailable
	 */
	public boolean isProfilePicAvailable() {
		return isProfilePicAvailable;
	}

	/**
	 * @param isProfilePicAvailable
	 *            the isProfilePicAvailable to set
	 */
	public void setProfilePicAvailable(boolean isProfilePicAvailable) {
		this.isProfilePicAvailable = isProfilePicAvailable;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the profilePicPath
	 */
	public String getProfilePicPath() {
		return profilePicPath;
	}

	/**
	 * @param profilePicPath
	 *            the profilePicPath to set
	 */
	public void setProfilePicPath(String profilePicPath) {
		this.profilePicPath = profilePicPath;
	}

	/**
	 * @return the userContactNum
	 */
	public String getUserContactNum() {
		return userContactNum;
	}

	/**
	 * @param userContactNum
	 *            the userContactNum to set
	 */
	public void setUserContactNum(String userContactNum) {
		this.userContactNum = userContactNum;
	}

	/**
	 * @return the userCountry
	 */
	public String getUserCountry() {
		return userCountry;
	}

	/**
	 * @param userCountry
	 *            the userCountry to set
	 */
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	/**
	 * @return the userPhysicalAddress
	 */
	public String getUserPhysicalAddress() {
		return userPhysicalAddress;
	}

	/**
	 * @param userPhysicalAddress
	 *            the userPhysicalAddress to set
	 */
	public void setUserPhysicalAddress(String userPhysicalAddress) {
		this.userPhysicalAddress = userPhysicalAddress;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the loginValue
	 */
	public LoginValue getLoginValue() {
		return loginValue;
	}

	/**
	 * @param loginValue
	 *            the loginValue to set
	 */
	public void setLoginValue(LoginValue loginValue) {
		this.loginValue = loginValue;
	}

}