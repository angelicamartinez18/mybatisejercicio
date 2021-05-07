package com.ejercicio;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ejercicio.dao.EmployeeDaoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {EjermybatisApplication.class})
public class EjermybatisApplicationTests {
@Autowired
EmployeeDaoImpl employeeDaoImpl;
@Test
public void test()   {
	try {
		employeeDaoImpl.consultarempleado("lucy");
	}catch(Exception e) {
		e.printStackTrace();
		
	}

   
}

}
