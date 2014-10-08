package org.dps.dao.usermanagement.ibatis;
import org.dps.value.usermanagement.UserValue;
import org.dps.dao.usermanagement.UserManagementDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class SqlMapUserManagementDao extends SqlMapClientDaoSupport implements UserManagementDao {

	public SqlMapUserManagementDao(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param userValue
	 */
	public void createUser(UserValue userValue){

	}

	/**
	 * 
	 * @param userValue
	 */
	public UserValue retrieveSecurityQuestionForUser(UserValue userValue){
		return null;
	}

	/**
	 * 
	 * @param userValue
	 */
	public UserValue retrieveUserInfo(UserValue userValue){
		return null;
	}

	/**
	 * 
	 * @param userValue
	 * @param isDeactivate
	 */
	public void updateUser(UserValue userValue, boolean isDeactivate){

	}

	/**
	 * 
	 * @param userValue
	 */
	public int validateDuplicateAccountId(UserValue userValue){
		return 0;
	}

	/**
	 * 
	 * @param userValue
	 */
	public int validateDuplicateEmail(UserValue userValue){
		return 0;
	}

}