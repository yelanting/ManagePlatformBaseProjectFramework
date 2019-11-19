package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysRoleMenu;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysRoleMenuMapper {
	/**
	 * 根据主键删除
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * 插入角色菜单关系表数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insert(SysRoleMenu record);

	/**
	 * 插入角色菜单关系数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insertSelective(SysRoleMenu record);

	/**
	 * 更新角色菜单关系数据
	 * 
	 * @see :
	 * @param :
	 * @return : SysRoleMenu
	 * @param id
	 * @return
	 */

	SysRoleMenu selectByPrimaryKey(Long id);

	/**
	 * 可选择字段更新角色按钮关系数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(SysRoleMenu record);

	/**
	 * 更新角色按钮关系数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(SysRoleMenu record);

	/**
	 * 根据角色iD查找聚按钮关系表
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysRoleMenu>
	 * @param roleId
	 * @return
	 */
	List<SysRoleMenu> findRoleMenus(@Param(value = "roleId") Long roleId);

	/**
	 * 查找角色按钮关系表所有数据
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysRoleMenu>
	 * @return
	 */
	List<SysRoleMenu> findAll();

	/**
	 * 根据角色ID删除该角色关联的角色菜单数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param roleId
	 * @return
	 */
	int deleteByRoleId(@Param(value = "roleId") Long roleId);
}