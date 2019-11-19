package com.baseproject.framework.admin.service;

import java.util.List;

import com.baseproject.framework.admin.model.SysConfig;
import com.baseproject.framework.core.service.CurdService;

/**
 * 系统配置管理
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
