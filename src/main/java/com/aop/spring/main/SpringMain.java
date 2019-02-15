package com.aop.spring.main;

import com.aop.spring.config.Configurateur;
import com.aop.spring.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * @author TARIK ABARGHAZ
 * Il y a deux method pour utiliser AOP
 *
 * 1 : XML => Desactiver @Component
 * 2 : Annotation => Activer @Component dans les packages
 * 	com.aop.spring.aspect, com.aop.spring.model
 */
public class SpringMain {

	public static void main(String[] args) {
		// Using XML FILE

		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeServiceXML employeeService = context.getBean("employeeServiceXML", EmployeeServiceXML.class);*/

		// Using Configuration Class Bean

		ApplicationContext context = new AnnotationConfigApplicationContext(Configurateur.class);
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");


		employeeService.getEmployee().setName("Pankaj");

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().throwException();

		((AbstractApplicationContext) context).close();
	}

}
