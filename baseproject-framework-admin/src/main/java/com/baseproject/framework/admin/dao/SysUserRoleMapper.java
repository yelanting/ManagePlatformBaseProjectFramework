package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysUserRole;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysUserRoleMapper {
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
	 * 根据用户角色关系信息插入
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insert(SysUserRole record);

	/**
	 * 选择插入用户角色关系表
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insertSelective(SysUserRole record);

	/**
	 * 根据主键查找用户角色关系表
	 * 
	 * @see :
	 * @param :
	 * @return : SysUserRole
	 * @param id
	 * @return
	 */
	SysUserRole selectByPrimaryKey(Long id);

	/**
	 * 根据用户角色关系表数据更改
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(SysUserRole record);

	/**
	 * 根据主键更新用户角色关系表
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(SysUserRole record);

	/**
	 * 根据用户id查找用户角色表数据
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysUserRole>
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(@Param(value = "userId") Long userId);

	/**
	 * 根据用户id删除中间表数据
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param userId
	 * @return
	 */
	int deleteByUserId(@Param(value = "userId") Long userId);
}