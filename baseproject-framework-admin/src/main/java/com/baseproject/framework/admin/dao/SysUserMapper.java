package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysUser;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysUserMapper {
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
	 * 插叙用户
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insert(SysUser record);

	/**
	 * 插入用户，可选择字段
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int insertSelective(SysUser record);

	/**
	 * 根据主键查找有用户
	 * 
	 * @see :
	 * @param :
	 * @return : SysUser
	 * @param id
	 * @return
	 */
	SysUser selectByPrimaryKey(Long id);

	/**
	 * 更新实体，可选择字段
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(SysUser record);

	/**
	 * 更新实体
	 * 
	 * @see :
	 * @param :
	 * @return : int
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(SysUser record);

	/**
	 * 查询用户列表
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysUser>
	 * @return
	 */
	List<SysUser> findPage();

	/**
	 * 根据用户名查询用户实体
	 * 
	 * @see :
	 * @param :
	 * @return : SysUser
	 * @param name
	 * @return
	 */
	SysUser findByName(@Param(value = "name") String name);

	/**
	 * 根据用户名查询用户
	 * 
	 * @see :
	 * @param :
	 * @return : List<SysUser>
	 * @param name
	 * @return
	 */
	List<SysUser> findPageByName(@Param(value = "name") String name);

	/**
	 * 
	 * @see : 根据用户名称和邮箱查询用户
	 * @param :
	 * @return : List<SysUser>
	 * @param name
	 * @param email
	 * @return
	 */
	List<SysUser> findPageByNameAndEmail(@Param(value = "name") String name,
	        @Param(value = "email") String email);
}