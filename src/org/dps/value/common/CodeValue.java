/**
 * 
 */
package org.dps.value.common;

import java.io.Serializable;

/**
 * @author manish
 *
 */
public class CodeValue extends BaseValue implements Serializable {

	private static final long serialVersionUID = -7494786309956210190L;
	private String codeValueId = null;
	private String codeValueDescription = null;
	private CodeGroupValue coderCodeGroupValue = null;

	/**
	 * @return the codeValueId
	 */
	public String getCodeValueId() {
		return codeValueId;
	}

	/**
	 * @param codeValueId
	 *            the codeValueId to set
	 */
	public void setCodeValueId(String codeValueId) {
		this.codeValueId = codeValueId;
	}

	/**
	 * @return the codeValueDescription
	 */
	public String getCodeValueDescription() {
		return codeValueDescription;
	}

	/**
	 * @param codeValueDescription
	 *            the codeValueDescription to set
	 */
	public void setCodeValueDescription(String codeValueDescription) {
		this.codeValueDescription = codeValueDescription;
	}

	/**
	 * @return the coderCodeGroupValue
	 */
	public CodeGroupValue getCoderCodeGroupValue() {
		return coderCodeGroupValue;
	}

	/**
	 * @param coderCodeGroupValue
	 *            the coderCodeGroupValue to set
	 */
	public void setCoderCodeGroupValue(CodeGroupValue coderCodeGroupValue) {
		this.coderCodeGroupValue = coderCodeGroupValue;
	}

}
