package org.dps.action.usermanagement;
import org.dps.service.usermanagement.UserManagementService;
import org.dps.value.usermanagement.UserValue;

/**
 * This class will be part of presentation layer of user management module.
 * Initilal validations on the input data will be performed by the functions of
 * this class.
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class UserManagementAction {

	private UserManagementService userManagementService;
	private UserValue userValue;

	public UserManagementAction(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * This method will be used to deactivate author profile on click of Deactivate
	 * Profile link on user's home page
	 */
	public String deactivateProfile(){
		return "";
	}

	/**
	 * This method will be used to edit and update author profile using system
	 * generated user id. Account Id field will be readonly and cannot be edited using
	 * edit profile functionality.
	 */
	public String editprofile(){
		return "";
	}

	/**
	 * This method will be used to load the author registration screen. This method
	 * will be invoked onclick of Register Me link  from Application landing page.
	 */
	public String loadAuthorRegistrationScreen(){
		return "";
	}

	/**
	 * This method will be used to load the change password screen. This method will
	 * be invoked onclick of Change password link from the User's Home page.
	 */
	public String loadChangePasswordScreen(){
		return "";
	}

	/**
	 * This method will be invoked on click of Edit Profile link on User's home page.
	 * This method will fetch the user details based on system generated user Id.
	 */
	public String loadEditProfileScreen(){
		return "";
	}

	/**
	 * This method will be used to load recover password screen. The same screen will
	 * be used to recover account Id and password.
	 */
	public String loadRecoverCredentialsScreen(){
		return "";
	}

	/**
	 * This method will be used to load security question selected by the user during
	 * registration. Security question will be retrieved based on account id and
	 * registered email address.
	 */
	public Void loadSecurityQuestionForUser(){

	}

	/**
	 * This method will be used to register Author in the system. This method will
	 * check if account id and author email exists in the system or not. If exists,
	 * system will not allow the author to register and will show a validation message.
	 */
	public String registerAuthor(){
		return "";
	}

	/**
	 * This method will check if the user entered account Id already existis in the
	 * application or not.
	 */
	public boolean validateDuplicateAccountId(){
		return false;
	}

	/**
	 * This method will check if the user entered email from Register Author
	 * screen/Edit profile screen exists in the application or not. 
	 */
	public boolean validateDuplicateEmail(){
		return false;
	}

}