package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysLog;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysLogMapper {
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

	int insert(SysLog record);

	int insertSelective(SysLog record);

	SysLog selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysLog record);

	int updateByPrimaryKey(SysLog record);

	List<SysLog> findPage();

	List<SysLog> findPageByUserName(@Param(value = "userName") String userName);
}