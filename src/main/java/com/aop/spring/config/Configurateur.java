package com.aop.spring.config;

import com.aop.spring.service.EmployeeService;
import org.springframework.context.annotation.*;

/**
 * @author TARIK ABARGHAZ
 */
@Configuration
@ComponentScan(basePackages = {
        "com.aop.spring.aspect",
        "com.aop.spring.model"
        }
)
@EnableAspectJAutoProxy
public class Configurateur {

    @Bean
    @Scope(value= "singleton")
    public EmployeeService employeeService() {
        return new EmployeeService();
    }

}
