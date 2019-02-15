package com.aop.spring.model;

import com.aop.spring.aspect.Loggable;
import org.springframework.stereotype.Component;
/**
 * @author TARIK ABARGHAZ
 */
@Component
public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}

	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
