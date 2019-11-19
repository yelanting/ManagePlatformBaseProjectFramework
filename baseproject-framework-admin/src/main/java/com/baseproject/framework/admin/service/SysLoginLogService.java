package com.baseproject.framework.admin.service;

import com.baseproject.framework.admin.model.SysLoginLog;
import com.baseproject.framework.core.service.CurdService;

/**
 * 登录日志
 * @author Administrator
 * @date Jan 13, 2019
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {

	/**
	 * 记录登录日志
	 * @param userName
	 * @param ip
	 * @return
	 */
	int writeLoginLog(String userName, String ip);
}
