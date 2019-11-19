package com.baseproject.framework.admin.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.baseproject.framework.admin.model.SysLog;
import com.baseproject.framework.admin.service.SysLogService;
import com.baseproject.framework.admin.util.HttpUtils;
import com.baseproject.framework.admin.util.IPUtils;
import com.baseproject.framework.admin.util.SecurityUtils;

/**
 * 系统日志，切面处理类，记录日志
 * 
 * @author Administrator
 * @date Jan 19, 2019
 */
@Aspect
@Component
public class SysLogAspect {

	private static final int MAX_REQUEST_ENTITY_LENGTH = 200;
	@Autowired
	private SysLogService sysLogService;

	@Pointcut("execution(* com.baseproject.framework.*.service.*.*(..))")
	public void logPointCut() {

	}

	@Around("logPointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long beginTime = System.currentTimeMillis();
		// 执行方法
		Object result = point.proceed();
		// 执行时长(毫秒)
		long time = System.currentTimeMillis() - beginTime;
		// 保存日志
		saveSysLog(point, time);
		return result;
	}

	private void saveSysLog(ProceedingJoinPoint joinPoint, long time) {
		String userName = SecurityUtils.getUsername();
		if (joinPoint.getTarget() instanceof SysLogService) {
			return;
		}
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		SysLog sysLog = new SysLog();

		// 请求的方法名
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = signature.getName();
		sysLog.setMethod(className + "." + methodName + "()");

		// 请求的参数
		Object[] args = joinPoint.getArgs();
		try {
			String params = JSONObject.toJSONString(args[0]);
			if (params.length() > MAX_REQUEST_ENTITY_LENGTH) {
				params = params.substring(0, MAX_REQUEST_ENTITY_LENGTH) + "...";
			}
			sysLog.setParams(params);
		} catch (Exception e) {
		}

		// 获取request
		HttpServletRequest request = HttpUtils.getHttpServletRequest();
		// 设置IP地址
		sysLog.setIp(IPUtils.getIpAddr(request));

		// 用户名
		sysLog.setUserName(userName);

		// 执行时长(毫秒)
		sysLog.setTime(time);

		// 保存系统日志
		sysLogService.save(sysLog);
	}

}
