package com.shangsc.platform.model;

import com.shangsc.platform.core.model.Condition;
import com.shangsc.platform.core.model.Operators;
import com.shangsc.platform.core.view.InvokeResult;
import com.shangsc.platform.model.base.BaseWaterIndex;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class WaterIndex extends BaseWaterIndex<WaterIndex> {
	public static final WaterIndex me = new WaterIndex();

	/**
	 * 水表编号是否已存在
	 * @param innerCode
	 * @return
	 */
	public boolean hasExist(String innerCode){
		Set<Condition> conditions = new HashSet<Condition>();
		conditions.add(new Condition("inner_code", Operators.EQ, innerCode));
		long num = this.getCount(conditions);
		return num>0?true:false;
	}

	public InvokeResult save(Long id, Long companyId, String innerCode, String waterUseType, BigDecimal waterIndex, BigDecimal january,
							 BigDecimal february, BigDecimal march, BigDecimal april, BigDecimal may, BigDecimal june, BigDecimal july,
							 BigDecimal august, BigDecimal september, BigDecimal october, BigDecimal november, BigDecimal december) {
		if (null != id && id > 0l) {
			WaterIndex index = this.findById(id);
			if (index == null) {
				return InvokeResult.failure("更新失败, 该单位用水指标不存在");
			}
			index = setProp(index, companyId, innerCode, waterUseType, waterIndex, january, february, march, april,
					may, june, july, august, september, october, november, december);
			index.update();
		} else {
			if (this.hasExist(innerCode)) {
				return InvokeResult.failure("单位名称或编号已存在");
			} else {
				WaterIndex index = new WaterIndex();
				index = setProp(index, companyId, innerCode, waterUseType, waterIndex, january, february, march, april,
						may, june, july, august, september, october, november, december);
				index.save();
			}
		}
		return InvokeResult.success();
	}

	private WaterIndex setProp(WaterIndex index, Long companyId, String innerCode, String waterUseType, BigDecimal waterIndex,
							   BigDecimal january, BigDecimal february, BigDecimal march, BigDecimal april, BigDecimal may, BigDecimal june,
							   BigDecimal july, BigDecimal august, BigDecimal september, BigDecimal october, BigDecimal november, BigDecimal december) {
		index.setCompanyId(companyId);
		index.setInnerCode(innerCode);
		index.setWaterIndex(waterIndex);
		index.setWaterUseType(waterUseType);
		index.setJanuary(january);
		index.setFebruary(february);
		index.setMarch(march);
		index.setApril(april);
		index.setMay(may);
		index.setJune(june);
		index.setJuly(july);
		index.setAugust(august);
		index.setSeptember(september);
		index.setOctober(october);
		index.setNovember(november);
		index.setDecember(december);
		return index;
	}

	public InvokeResult deleteData(Long id) {
		this.deleteById(id);
		return InvokeResult.success();
	}
}
