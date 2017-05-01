/**
 * 
 */
package com.raj.customerRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.raj.model.Employee;

/**
 * @author admin
 *
 */
public interface CustomerRepository extends CrudRepository<Employee, Long>{

	List<Employee> findByEmail(String email);

    List<Employee> findByCreatedDate(Date date);

	// custom query example and return a stream
    @Query("select c from Customer c where c.email = :email")
    Stream<Employee> findByEmailReturnStream(@Param("email") String email);
}
