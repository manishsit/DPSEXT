/**
 * 
 */
package org.dps.bo.common;

import java.util.List;

import org.dps.value.common.CodeGroupValue;
import org.dps.value.common.CodeValue;

/**
 * @author manish
 *
 */
public interface StaticBo {
	public List<CodeValue> retrieveStaticLookUp(CodeGroupValue codeGroupValue);
}
