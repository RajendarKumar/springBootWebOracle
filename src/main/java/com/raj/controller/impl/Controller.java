/**
 * 
 */
package com.raj.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.constant.SalaryFactor;
import com.raj.controller.api.IController;
import com.raj.model.Employee;
import com.raj.service.api.ICalculateSalary;
import com.raj.service.api.IEmployeeService;

/**
 * @author admin
 *
 */
@RestController
@EnableAutoConfiguration
public class Controller implements IController{

	@Autowired
	private ICalculateSalary calSalaryService;
	
	@Autowired
	private IEmployeeService employeeService;
	
	@Override
	@RequestMapping("/hello")
	public String helloWord() {
		return "{value : hello World}";
	}

	@Override
	@RequestMapping(value="/salary",  method=RequestMethod.GET)
	public @ResponseBody Employee employeeWithIncreasedSalary(@RequestParam(value="email", required=false, defaultValue="NA") String email) {
		List<Employee> emps = employeeService.findByEmail(email);
		if(null != emps && !emps.isEmpty()){
			Integer salary = calSalaryService.increaseSalary(emps.get(0).getSalary(), SalaryFactor.PERCENT, 10.0f);
			emps.get(0).setSalary(salary);
		}
		return emps.get(0);
	}

	
}
