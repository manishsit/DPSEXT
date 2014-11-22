package org.dps.value.common;

import java.io.Serializable;

import org.dps.value.login.LoginValue;

/**
 * This value object contains common properties used accross all the value
 * objects
 * 
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class BaseValue implements Serializable {

	private static final long serialVersionUID = 3621722685459305749L;
	private LoginValue createdByUser;
	private LoginValue updatedByUser;

	/**
	 * @return the createdByUser
	 */
	public LoginValue getCreatedByUser() {
		return createdByUser;
	}

	/**
	 * @param createdByUser
	 *            the createdByUser to set
	 */
	public void setCreatedByUser(LoginValue createdByUser) {
		this.createdByUser = createdByUser;
	}

	/**
	 * @return the updatedByUser
	 */
	public LoginValue getUpdatedByUser() {
		return updatedByUser;
	}

	/**
	 * @param updatedByUser
	 *            the updatedByUser to set
	 */
	public void setUpdatedByUser(LoginValue updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

}