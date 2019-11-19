package com.baseproject.framework.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.baseproject.framework.admin.model.SysUser;
import com.baseproject.framework.admin.model.SysUserRole;
import com.baseproject.framework.core.page.PageRequest;
import com.baseproject.framework.core.service.CurdService;

/**
 * 用户管理
 * 
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysUserService extends CurdService<SysUser> {
	/**
	 * 根据用户名查找用户
	 * 
	 * @see :
	 * @param :
	 * @return : SysUser
	 * @param username
	 * @return
	 */
	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * 
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * 
	 * @param userId
	 *            ： 待查找的用户id
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * 
	 * @param pageRequest
	 *            要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

}
