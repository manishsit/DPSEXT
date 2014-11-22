package org.dps.value.login;

import java.io.Serializable;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:31
 */
public class UserRoleValue implements Serializable {

	private static final long serialVersionUID = -8277373997309651012L;
	private String roleId;
	private String roleName;

	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}