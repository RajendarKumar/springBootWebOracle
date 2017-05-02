/**
 * 
 */
package com.raj.service.api;

import java.util.List;

import com.raj.model.Employee;

/**
 * @author Rajendar Kumar
 *
 */
public interface IEmployeeService {

	/**
	 * <p>This method will return list of employee on the basis of email address.<p>
	 * 
	 * @param email
	 * @return employees
	 */
	public List<Employee> findByEmail(String email);
		
}