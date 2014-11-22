package org.dps.bo.usermanagement.impl;
import org.dps.dao.usermanagement.UserManagementDao;
import org.dps.value.usermanagement.UserValue;
import org.dps.bo.usermanagement.UserManagementBo;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class UserManagementBoImpl extends UserManagementBo {

	private UserManagementDao userManagementDao;

	public UserManagementBoImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * This method will be user to save user information during user registration.
	 * This method will accept user value object as input  and save into database.
	 * This method will throw back DPSCommonException if the save is unsuccessful.
	 * 
	 * @param userValue
	 */
	public void createUser(UserValue userValue){
		userManagementDao.createUser(userValue);
	}

	/**
	 * This method will be used to load security question selected by the user during
	 * registration. Security question will be retrieved based on account id and
	 * registered email address.
	 * 
	 * @param userValue
	 */
	public UserValue retrieveSecurityQuestionForUser(UserValue userValue){
		return null;
	}

	/**
	 * This method will be used to retrieve user information based on the system
	 * generated user Id.
	 * 
	 * @param userValue
	 */
	public UserValue retrieveUserInfo(UserValue userValue){
		return null;
	}

	/**
	 * This method will be used to update user profile based on system generated user
	 * Id. The same method will  be used to deactivate user profile based on flag
	 * isDeactivate. The method will throw back exception if the update is
	 * unsuccessful
	 * 
	 * @param userValue
	 * @param isDeactivate
	 */
	public void updateUser(UserValue userValue, boolean isDeactivate){

	}

	/**
	 * This method will check if the user entered email from Register Author
	 * screen/Edit profile screen exists in the application or not.
	 * 
	 * @param userValue
	 */
	public boolean validateDuplicateAccountId(UserValue userValue){
		return false;
	}

	/**
	 * This method will check if the user entered email from Register Author
	 * screen/Edit profile screen exists in the application or not.
	 * 
	 * @param userValue
	 */
	public boolean validateDuplicateEmail(UserValue userValue){
		return false;
	}

	public UserManagementDao getUserManagementDao() {
		return userManagementDao;
	}

	public void setUserManagementDao(UserManagementDao userManagementDao) {
		this.userManagementDao = userManagementDao;
	}

}