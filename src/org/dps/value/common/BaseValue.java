package org.dps.value.common;
import org.dps.value.login.LoginValue;

/**
 * This value object contains common properties used accross all the value objects
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class BaseValue {

	private LoginValue createdByUser;
	private LoginValue updatedByUser;

	public BaseValue(){

	}

	public void finalize() throws Throwable {

	}

}