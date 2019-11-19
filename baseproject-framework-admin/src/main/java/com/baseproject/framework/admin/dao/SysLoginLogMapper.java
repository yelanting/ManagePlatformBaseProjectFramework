package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysLoginLog;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysLoginLogMapper {
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

	int insert(SysLoginLog record);

	int insertSelective(SysLoginLog record);

	SysLoginLog selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysLoginLog record);

	int updateByPrimaryKey(SysLoginLog record);

	List<SysLoginLog> findPage();

	List<SysLoginLog> findPageByUserName(
	        @Param(value = "userName") String userName);

	List<SysLoginLog> findPageByStatus(@Param(value = "status") String status);

	List<SysLoginLog> findPageByUserNameAndStatus(
	        @Param(value = "userName") String userName,
	        @Param(value = "status") String status);

	List<SysLoginLog> findByUserNameAndStatus(
	        @Param(value = "userName") String userName,
	        @Param(value = "status") String status);
}