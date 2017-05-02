/**
 * 
 */
package com.raj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.cemployeeRepository.EmployeeRepository;
import com.raj.model.Employee;
import com.raj.service.api.IEmployeeService;

/**
 * @author Rajendar Kumar
 *
 */
@Service("employeeService")
public class EmployeeServiceImployee implements IEmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;
	/* (non-Javadoc)
	 * @see com.raj.service.api.IEmployeeService#findByEmail(java.lang.String)
	 */
	@Override
	public List<Employee> findByEmail(String email) {
		return employeeRepository.findByEmail(email);
	}

}
