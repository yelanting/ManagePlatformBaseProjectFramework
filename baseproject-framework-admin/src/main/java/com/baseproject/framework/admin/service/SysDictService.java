package com.baseproject.framework.admin.service;

import java.util.List;

import com.baseproject.framework.admin.model.SysDict;
import com.baseproject.framework.core.service.CurdService;

/**
 * 字典管理
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
