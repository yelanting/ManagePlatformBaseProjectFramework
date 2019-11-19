package com.baseproject.framework.admin.dao;

import java.util.List;

import com.baseproject.framework.admin.model.SysDept;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysDeptMapper {
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

	int insert(SysDept record);

	int insertSelective(SysDept record);

	SysDept selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysDept record);

	int updateByPrimaryKey(SysDept record);

	List<SysDept> findPage();

	List<SysDept> findAll();
}