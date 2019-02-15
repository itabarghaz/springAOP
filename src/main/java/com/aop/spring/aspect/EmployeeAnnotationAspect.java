package com.aop.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * @author TARIK ABARGHAZ
 */
@Aspect
@Component
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.aop.spring.aspect.Loggable)")
	public void myAdvice(){
			System.out.println("Executing myAdvice!!");
	}
}
