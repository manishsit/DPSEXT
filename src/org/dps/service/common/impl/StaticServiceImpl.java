/**
 * 
 */
package org.dps.service.common.impl;

import java.util.List;

import org.dps.bo.common.StaticBo;
import org.dps.service.common.StaticService;
import org.dps.value.common.CodeGroupValue;
import org.dps.value.common.CodeValue;

/**
 * @author manish
 *
 */
public class StaticServiceImpl implements StaticService{
	private StaticBo staticBo=null;

	public List<CodeValue> retrieveStaticLookUp(CodeGroupValue codeGroupValue) {
		return staticBo.retrieveStaticLookUp(codeGroupValue);
	}

	/**
	 * @return the staticBo
	 */
	public StaticBo getStaticBo() {
		return staticBo;
	}

	/**
	 * @param staticBo the staticBo to set
	 */
	public void setStaticBo(StaticBo staticBo) {
		this.staticBo = staticBo;
	}

}
