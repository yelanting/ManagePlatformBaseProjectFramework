package com.baseproject.framework.admin.service;

import java.util.List;

import com.baseproject.framework.admin.model.SysMenu;
import com.baseproject.framework.admin.model.SysRole;
import com.baseproject.framework.admin.model.SysRoleMenu;
import com.baseproject.framework.core.service.CurdService;

/**
 * 角色管理
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
