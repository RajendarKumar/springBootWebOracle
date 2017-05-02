/**
 * 
 */
package com.raj.controller.api;

import com.raj.model.Employee;

/**
 * @author admin
 *
 */
public interface IController {

	/**
	 * 
	 * @return
	 */
	public String helloWord();
	/**
	 * 
	 * @param email
	 * @return
	 */
	public Employee employeeWithIncreasedSalary(String email);
}
