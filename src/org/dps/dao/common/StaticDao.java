/**
 * 
 */
package org.dps.dao.common;

import java.util.List;

import javax.faces.model.SelectItem;

import org.dps.value.common.CodeGroupValue;

/**
 * @author manish
 *
 */
public interface StaticDao {
	public List<SelectItem> retrieveStaticLookUp(CodeGroupValue codeGroupValue);
}
