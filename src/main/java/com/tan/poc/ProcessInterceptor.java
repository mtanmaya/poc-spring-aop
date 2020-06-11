/**
 * 
 */
package com.tan.poc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tmalik
 *
 */

@Slf4j
@Component
@Aspect
public class ProcessInterceptor {

	@AfterThrowing(pointcut = "execution(* com.tan.poc.ClassB.methodB(..))", throwing = "exception")
	public void handleExceptionFromB(JoinPoint joinPoint, Exception exception) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		log.info("method name::: {}", methodName);

		Object[] objArray = joinPoint.getArgs();
		log.info("objArray::: {}", objArray);

		Object targetObj = joinPoint.getTarget();
		log.info("targetObj::: {}", targetObj);
	}

	@AfterThrowing(pointcut = "execution(* com.tan.poc.ClassA.methodA(..))", throwing = "exception")
	public void handleExceptionFromA(JoinPoint joinPoint, Exception exception) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		log.info("method name of A::: {}", methodName);

		Object[] objArray = joinPoint.getArgs();
		log.info("objArray of A::: {}", objArray);

		Object targetObj = joinPoint.getTarget();
		log.info("targetObj of A::: {}", targetObj);
	}

	@AfterThrowing(pointcut = "execution(* com.tan.poc.ClassA.methodDWithParam(..))", throwing = "exception")
	public void handleExceptionFromMethodDWithParam(JoinPoint joinPoint, Exception exception) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		log.info("method name of methodDWithParam::: {}", methodName);

		Object[] objArray = joinPoint.getArgs();
		log.info("objArray of methodDWithParam::: {}", objArray);

		Object targetObj = joinPoint.getTarget();
		log.info("targetObj of methodDWithParam::: {}", targetObj);

	}
}
