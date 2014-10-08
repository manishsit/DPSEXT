/**
 * 
 */
package org.dps.dao.common;

import java.util.List;

import org.dps.value.common.CodeGroupValue;
import org.dps.value.common.CodeValue;

/**
 * @author manish
 *
 */
public interface StaticDao {
	public List<CodeValue> retrieveStaticLookUp(CodeGroupValue codeGroupValue);
}
