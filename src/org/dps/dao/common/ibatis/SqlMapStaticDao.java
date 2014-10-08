package org.dps.dao.common.ibatis;

import java.util.List;

import org.dps.dao.common.StaticDao;
import org.dps.value.common.CodeGroupValue;
import org.dps.value.common.CodeValue;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * @author sitman
 * @version 1.0
 * @created 29-Sep-2014 18:37:30
 */
public class SqlMapStaticDao extends SqlMapClientDaoSupport implements StaticDao {

	/* (non-Javadoc)
	 * @see org.dps.dao.common.StaticDao#retrieveStaticLookUp(org.dps.value.common.CodeGroupValue)
	 */
	@Override
	public List<CodeValue> retrieveStaticLookUp(CodeGroupValue codeGroupValue) {
		// TODO Auto-generated method stub
		return null;
	}
}
