/**
 * 
 */
package org.dps.service.common;

import java.util.List;

import javax.faces.model.SelectItem;

import org.dps.value.common.CodeGroupValue;

/**
 * @author manish
 *
 */
public interface StaticService {

	public List<SelectItem> retrieveStaticLookUp(CodeGroupValue codeGroupValue);

}
