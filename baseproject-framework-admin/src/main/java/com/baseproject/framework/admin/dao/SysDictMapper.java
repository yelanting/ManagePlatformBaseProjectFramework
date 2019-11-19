package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysDict;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysDictMapper {
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

	int insert(SysDict record);

	int insertSelective(SysDict record);

	SysDict selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysDict record);

	int updateByPrimaryKey(SysDict record);

	List<SysDict> findPage();

	List<SysDict> findPageByLabel(@Param(value = "label") String label);

	List<SysDict> findByLable(@Param(value = "label") String label);
}