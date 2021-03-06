package com.shangsc.platform.model.base;

import com.shangsc.platform.core.model.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends BaseModel<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setUid(Integer uid) {
		set("uid", uid);
	}

	public Integer getUid() {
		return get("uid");
	}

	public void setFrom(String from) {
		set("from", from);
	}

	public String getFrom() {
		return get("from");
	}

	public void setIp(String ip) {
		set("ip", ip);
	}

	public String getIp() {
		return get("ip");
	}

	public void setUrl(String url) {
		set("url", url);
	}

	public String getUrl() {
		return get("url");
	}

	public void setDate(java.util.Date date) {
		set("date", date);
	}

	public java.util.Date getDate() {
		return get("date");
	}

	public void setErrMsg(String errMsg) {
		set("err_msg", errMsg);
	}

	public String getErrMsg() {
		return get("err_msg");
	}

	public void setErrCode(Integer errCode) {
		set("err_code", errCode);
	}

	public Integer getErrCode() {
		return get("err_code");
	}

	public void setClassName(String className) {
		set("class_name", className);
	}

	public String getClassName() {
		return get("class_name");
	}

	public void setMethodName(String methodName) {
		set("method_name", methodName);
	}

	public String getMethodName() {
		return get("method_name");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setSpendTime(Long spendTime) {
		set("spend_time", spendTime);
	}

	public Long getSpendTime() {
		return get("spend_time");
	}

	public void setParams(String params) {
		set("params", params);
	}

	public String getParams() {
		return get("params");
	}

}
