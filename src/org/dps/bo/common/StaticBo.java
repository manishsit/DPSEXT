/**
 * 
 */
package org.dps.bo.common;

import java.util.List;

import javax.faces.model.SelectItem;

import org.dps.value.common.CodeGroupValue;

/**
 * @author manish
 *
 */
public interface StaticBo {
	public List<SelectItem> retrieveStaticLookUp(CodeGroupValue codeGroupValue);
}
