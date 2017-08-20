package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCompany<M extends BaseCompany<M>> extends BaseModel<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return get("id");
	}

	public void setInnerCode(String innerCode) {
		set("inner_code", innerCode);
	}

	public String getInnerCode() {
		return get("inner_code");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setStreet(String street) {
		set("street", street);
	}

	public String getStreet() {
		return get("street");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return get("address");
	}

	public void setCustomerType(Integer customerType) {
		set("customer_type", customerType);
	}

	public Integer getCustomerType() {
		return get("customer_type");
	}

	public void setWaterUseType(Integer waterUseType) {
		set("water_use_type", waterUseType);
	}

	public Integer getWaterUseType() {
		return get("water_use_type");
	}

	public void setContact(String contact) {
		set("contact", contact);
	}

	public String getContact() {
		return get("contact");
	}

	public void setPhone(String phone) {
		set("phone", phone);
	}

	public String getPhone() {
		return get("phone");
	}

	public void setPostalCode(String postalCode) {
		set("postal_code", postalCode);
	}

	public String getPostalCode() {
		return get("postal_code");
	}

	public void setDepartment(String department) {
		set("department", department);
	}

	public String getDepartment() {
		return get("department");
	}

	public void setWellCount(Integer wellCount) {
		set("well_count", wellCount);
	}

	public Integer getWellCount() {
		return get("well_count");
	}

	public void setFirstWatermeterCount(Integer firstWatermeterCount) {
		set("first_watermeter_count", firstWatermeterCount);
	}

	public Integer getFirstWatermeterCount() {
		return get("first_watermeter_count");
	}

	public void setRemotemeterCount(Integer remotemeterCount) {
		set("remotemeter_count", remotemeterCount);
	}

	public Integer getRemotemeterCount() {
		return get("remotemeter_count");
	}

	public void setUnitType(Integer unitType) {
		set("unit_type", unitType);
	}

	public Integer getUnitType() {
		return get("unit_type");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
