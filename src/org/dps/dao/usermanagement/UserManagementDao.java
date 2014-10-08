package org.dps.dao.usermanagement;

import org.dps.value.usermanagement.UserValue;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public interface UserManagementDao {

	/**
	 * 
	 * @param userValue
	 */
	public void createUser(UserValue userValue);

	/**
	 * 
	 * @param userValue
	 */
	public UserValue retrieveSecurityQuestionForUser(UserValue userValue);

	/**
	 * 
	 * @param userValue
	 */
	public UserValue retrieveUserInfo(UserValue userValue);

	/**
	 * 
	 * @param userValue
	 * @param isDeactivate
	 */
	public void updateUser(UserValue userValue, boolean isDeactivate);

	/**
	 * 
	 * @param userValue
	 */
	public int validateDuplicateAccountId(UserValue userValue);

	/**
	 * 
	 * @param userValue
	 */
	public int validateDuplicateEmail(UserValue userValue);

}