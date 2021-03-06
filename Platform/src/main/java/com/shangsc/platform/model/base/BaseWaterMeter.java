package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWaterMeter<M extends BaseWaterMeter<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setCompanyId(Long companyId) {
		set("company_id", companyId);
	}

	public Long getCompanyId() {
		return get("company_id");
	}

	public void setInnerCode(String innerCode) {
		set("inner_code", innerCode);
	}

	public String getInnerCode() {
		return get("inner_code");
	}

	public void setLineNum(String lineNum) {
		set("line_num", lineNum);
	}

	public String getLineNum() {
		return get("line_num");
	}

	public void setMeterNum(String meterNum) {
		set("meter_num", meterNum);
	}

	public String getMeterNum() {
		return get("meter_num");
	}

	public void setWatersType(Integer watersType) {
		set("waters_type", watersType);
	}

	public Integer getWatersType() {
		return get("waters_type");
	}

	public void setWaterUseType(Integer waterUseType) {
		set("water_use_type", waterUseType);
	}

	public Integer getWaterUseType() {
		return get("water_use_type");
	}

	public void setMeterAttr(String meterAttr) {
		set("meter_attr", meterAttr);
	}

	public String getMeterAttr() {
		return get("meter_attr");
	}

	public void setChargeType(Integer chargeType) {
		set("charge_type", chargeType);
	}

	public Integer getChargeType() {
		return get("charge_type");
	}

	public void setBillingCycle(String billingCycle) {
		set("billing_cycle", billingCycle);
	}

	public String getBillingCycle() {
		return get("billing_cycle");
	}

	public void setRegistDate(java.util.Date registDate) {
		set("regist_date", registDate);
	}

	public java.util.Date getRegistDate() {
		return get("regist_date");
	}

}
