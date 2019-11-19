package com.baseproject.framework.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baseproject.framework.admin.model.SysConfig;

/**
 * 
 * @author : 孙留平
 * @since : 2019年11月18日 下午4:11:10
 * @see :
 */
public interface SysConfigMapper {
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

	int insert(SysConfig record);

	int insertSelective(SysConfig record);

	SysConfig selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(SysConfig record);

	int updateByPrimaryKey(SysConfig record);

	List<SysConfig> findPage();

	List<SysConfig> findPageByLabel(@Param(value = "label") String label);

	List<SysConfig> findByLable(@Param(value = "label") String label);
}