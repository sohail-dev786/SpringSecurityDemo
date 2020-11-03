package com.learning.springsecurity.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.learning.springsecurity.models.Employee;
import com.learning.springsecurity.services.IEmployeeDao;


@Component
public class EmployeeDetailsService implements UserDetailsService {

	@Autowired
	IEmployeeDao empDao;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String empName) throws UsernameNotFoundException {
	
		Employee emplByName=empDao.findByEmpName(empName);
		
		if(emplByName!=null)
		{
			return new EmpDetails(emplByName);
		}
		else
		{
	 throw new UsernameNotFoundException("User Not Found");		
		}
	}

}
