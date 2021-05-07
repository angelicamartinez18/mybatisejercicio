package com.ejercicio.prueba;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.ejercicio.dao.EmployeeDaoImpl;
import com.ejercicio.model.Employee;

public class Prueba {
	 private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder;  
	    private static SqlSessionFactory sqlSessionFactory;  
	    private static void init() throws IOException {  
	        String resource = "mybatis-config.xml";  
	        Reader reader = Resources.getResourceAsReader(resource);  
	        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();  
	        sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);  
	    }  

	    public static void main(String[] args) throws Exception {
	        pruebaLlamadofuncion();
	    }

	    /**
	     * @throws IOException
	     */
	    private static void pruebaLlamadofuncion() throws IOException {
	        init();
	        SqlSession session= sqlSessionFactory.openSession();  
	        EmployeeDaoImpl employeeDao = session.getMapper(EmployeeDaoImpl.class);  
	        Employee employee = new Employee();  
	       employeeDao.consultarempleado("lucy");
	       
	        System.out.println(""+employee.getEmployeeId());
	        
	    }

}
