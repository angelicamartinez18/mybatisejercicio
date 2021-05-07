package com.ejercicio.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ejercicio.mapper.EmployeeMapper;
import com.ejercicio.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> findEmployee(){
		return employeeMapper.findEmployee();
	}


	
	public Employee consultarempleado(String employeeName) {
		Employee employee=null;
		HashMap<Object, Object> parametrosInOout = new HashMap<Object, Object>();
	
		parametrosInOout.put("p_name",employeeName);
		employeeMapper.consultarempleados(parametrosInOout);
		
		
		return employee;
	}

	





	@Override
	public Employee consultarempleados(HashMap<Object, Object> parametrosInOout) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	
	
}
