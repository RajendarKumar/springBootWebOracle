/**
 * 
 */
package com.raj.service.api;

import com.raj.constant.SalaryFactor;

/**
 * @author admin
 *
 */
public interface ICalculateSalary {

	/**
	 *<p>This method is used to increase the salary by given factor.<p>
	 * @param salary
	 * @param salaryFactor
	 * @param salaryFactorValue
	 * @return finalSalary
	 */
	public Integer increaseSalary(Integer salary, SalaryFactor salaryFactor, Float salaryFactorValue);
}
