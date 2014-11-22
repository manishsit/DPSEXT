/**
 * 
 */
package org.dps.value.common;

import java.io.Serializable;

/**
 * @author manish
 *
 */
public class CodeGroupValue extends BaseValue implements Serializable {

	private static final long serialVersionUID = -2432005763230252567L;
	private String codeGroupoId = null;
	private String codeDescription = null;

	/**
	 * @return the codeGroupoId
	 */
	public String getCodeGroupoId() {
		return codeGroupoId;
	}

	/**
	 * @param codeGroupoId
	 *            the codeGroupoId to set
	 */
	public void setCodeGroupoId(String codeGroupoId) {
		this.codeGroupoId = codeGroupoId;
	}

	/**
	 * @return the codeDescription
	 */
	public String getCodeDescription() {
		return codeDescription;
	}

	/**
	 * @param codeDescription
	 *            the codeDescription to set
	 */
	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}

}
