package org.dps.dao.common.ibatis;

import java.util.List;

import javax.faces.model.SelectItem;

import org.dps.dao.common.StaticDao;
import org.dps.exception.DPSSystemException;
import org.dps.value.common.CodeGroupValue;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class SqlMapStaticDao extends SqlMapClientDaoSupport implements
		StaticDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.dps.dao.common.StaticDao#retrieveStaticLookUp(org.dps.value.common
	 * .CodeGroupValue)
	 */
	@SuppressWarnings("unchecked")
	public List<SelectItem> retrieveStaticLookUp(CodeGroupValue codeGroupValue)
			throws DPSSystemException {
		List<SelectItem> countryMapLookup = null;
		try {
			countryMapLookup = getSqlMapClientTemplate().queryForList(
					"fetchCodeList", codeGroupValue);
		} catch (DataAccessException e) {
			throw new DPSSystemException(e);
		}
		return countryMapLookup;
	}
}
