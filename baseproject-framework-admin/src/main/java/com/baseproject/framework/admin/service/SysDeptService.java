package com.baseproject.framework.admin.service;

import java.util.List;

import com.baseproject.framework.admin.model.SysDept;
import com.baseproject.framework.core.service.CurdService;

/**
 * 机构管理
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
