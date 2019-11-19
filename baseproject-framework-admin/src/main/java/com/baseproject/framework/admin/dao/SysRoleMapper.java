package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysRole;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysRoleMapper {
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

	int insert(SysRole record);

	int insertSelective(SysRole record);

	SysRole selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysRole record);

	int updateByPrimaryKey(SysRole record);

	List<SysRole> findPage();

	/**
	 * 查找所有角色数据
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysRole>
	 * @return
	 */

	List<SysRole> findAll();

	/**
	 * 根据角色名称查找角色
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysRole>
	 * @param name
	 * @return
	 */
	List<SysRole> findPageByName(@Param(value = "name") String name);

	/**
	 * 根据角色名称查找角色
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysRole>
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(@Param(value = "name") String name);
}