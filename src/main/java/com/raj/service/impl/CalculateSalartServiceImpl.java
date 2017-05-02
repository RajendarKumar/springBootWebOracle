/**
 * 
 */
package com.raj.service.impl;

import org.springframework.stereotype.Service;

import com.raj.constant.SalaryFactor;
import com.raj.service.api.ICalculateSalary;

/**
 * @author admin
 *
 */
@Service("calSalryService")
public class CalculateSalartServiceImpl implements ICalculateSalary {
	/* (non-Javadoc)
	 * @see com.raj.service.api.ICalculateSalary#increaseSalary(java.lang.Integer, com.raj.constant.SalaryFactor)
	 */
	@Override
	public Integer increaseSalary(Integer salary, SalaryFactor salaryFactor, Float salaryFactorValue) {
		switch(salaryFactor){

		case PERCENT :
			salary = salary + salary * Math.round((salaryFactorValue)/100);
			break;
		case ADD :
			salary = salary +  Math.round(salaryFactorValue);
			break;
		case MULTIPLY : 
			salary =  Math.round(salary * salaryFactorValue);
			break;
		default:
			break;
		}
		return salary;
	}

}
