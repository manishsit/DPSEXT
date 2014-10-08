package org.dps.value.usermanagement;
import org.dps.value.common.BaseValue;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:31
 */
public class UserValue extends BaseValue {

	private String authoringLanguage;
	private String accountId;
	private String dateOfBirth;
	private String firstName;
	private boolean isProfilePicAvailable;
	private String lastName;
	private String profilePicPath;
	private String userContactNum;
	private String userCountry;
	private String userEmail;
	private String userId;
	private String userPassword;
	private String userPhysicalAddress;
	private String userSecretAnswer;
	private String userSecretQuestion;

	public UserValue(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * @return the authoringLanguage
	 */
	public String getAuthoringLanguage() {
		return authoringLanguage;
	}

	/**
	 * @param authoringLanguage the authoringLanguage to set
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
	 * @param dateOfBirth the dateOfBirth to set
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
	 * @param firstName the firstName to set
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
	 * @param isProfilePicAvailable the isProfilePicAvailable to set
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
	 * @param lastName the lastName to set
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
	 * @param profilePicPath the profilePicPath to set
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
	 * @param userContactNum the userContactNum to set
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
	 * @param userCountry the userCountry to set
	 */
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userPhysicalAddress
	 */
	public String getUserPhysicalAddress() {
		return userPhysicalAddress;
	}

	/**
	 * @param userPhysicalAddress the userPhysicalAddress to set
	 */
	public void setUserPhysicalAddress(String userPhysicalAddress) {
		this.userPhysicalAddress = userPhysicalAddress;
	}

	/**
	 * @return the userSecretAnswer
	 */
	public String getUserSecretAnswer() {
		return userSecretAnswer;
	}

	/**
	 * @param userSecretAnswer the userSecretAnswer to set
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
	 * @param userSecretQuestion the userSecretQuestion to set
	 */
	public void setUserSecretQuestion(String userSecretQuestion) {
		this.userSecretQuestion = userSecretQuestion;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}