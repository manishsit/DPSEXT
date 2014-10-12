/**
 * 
 */
package org.dps.bo.common.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.dps.bo.common.StaticBo;
import org.dps.dao.common.StaticDao;
import org.dps.value.common.CodeGroupValue;

/**
 * @author manish
 *
 */
public class StaticBoImpl implements StaticBo{
	private StaticDao staticDao =null;

	public List<SelectItem> retrieveStaticLookUp(CodeGroupValue codeGroupValue) {
		return staticDao.retrieveStaticLookUp(codeGroupValue);
	}

	/**
	 * @return the staticDao
	 */
	public StaticDao getStaticDao() {
		return staticDao;
	}

	/**
	 * @param staticDao the staticDao to set
	 */
	public void setStaticDao(StaticDao staticDao) {
		this.staticDao = staticDao;
	}

}
