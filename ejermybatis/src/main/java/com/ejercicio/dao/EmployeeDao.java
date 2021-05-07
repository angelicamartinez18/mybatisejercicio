package com.ejercicio.dao;

import java.util.HashMap;
import java.util.List;

import com.ejercicio.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> findEmployee();
	
	//public Employee consultarempleado (Employee employee);
	public Employee consultarempleados(HashMap<Object, Object> parametrosInOout);
	
	
	
	}
	

