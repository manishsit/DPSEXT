/**
 * 
 */
package org.dps.service.common;

import java.util.List;

import org.dps.value.common.CodeGroupValue;
import org.dps.value.common.CodeValue;

/**
 * @author manish
 *
 */
public interface StaticService {

	public List<CodeValue> retrieveStaticLookUp(CodeGroupValue codeGroupValue);

}
