package com.ejercicio.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ejercicio.model.Employee;

@Mapper
public interface EmployeeMapper {


public List<Employee> findEmployee();
//public Employee consultarempleados (Employee employee);


public Employee consultarempleados(HashMap<Object, Object> parametrosInOout);

}
