package com.aop.spring.service;

import com.aop.spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author TARIK ABARGHAZ
 */
public class EmployeeService {

	@Autowired
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}
}
