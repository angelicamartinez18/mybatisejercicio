package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.EmployeeDao;
import com.ejercicio.dao.EmployeeDaoImpl;
import com.ejercicio.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDaoImpl employeeDao;
	
	@Override
	public List<Employee> findEmployee(){
		return employeeDao.findEmployee();
	}

	@Override
	public Employee consultarempleado(String employeeName) {
		// TODO Auto-generated method stub
		return employeeDao.consultarempleado(employeeName);
	}

	

	
	
}
