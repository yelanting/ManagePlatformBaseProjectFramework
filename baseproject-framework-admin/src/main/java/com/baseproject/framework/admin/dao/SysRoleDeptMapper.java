package com.baseproject.framework.admin.dao;

import com.baseproject.framework.admin.model.SysRoleDept;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysRoleDeptMapper {
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

	int insert(SysRoleDept record);

	int insertSelective(SysRoleDept record);

	SysRoleDept selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysRoleDept record);

	int updateByPrimaryKey(SysRoleDept record);
}