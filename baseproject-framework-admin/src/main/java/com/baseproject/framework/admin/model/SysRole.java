package com.baseproject.framework.admin.model;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public class SysRole extends BaseModel {

	private String name;

	private String remark;

	private Byte delFlag;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Byte getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Byte delFlag) {
		this.delFlag = delFlag;
	}

}