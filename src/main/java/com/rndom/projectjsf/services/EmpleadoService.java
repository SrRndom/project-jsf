package com.rndom.projectjsf.services;
//Clase que permite realizar la logica de Negocio para Empleados

import java.util.ArrayList;
import java.util.List;

import com.rndom.projectjsf.entity.Empleado;

public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados() {
		//Generar lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Rorez");
		empleadoIBM.setSegundoApellido("Heraldo");
		empleadoIBM.setPuesto("Dev");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Ramona");
		empleadoMicrosoft.setPrimerApellido("Perez");
		empleadoMicrosoft.setSegundoApellido("Gazca");
		empleadoMicrosoft.setPuesto("Manager");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Mar");
		empleadoApple.setPrimerApellido("Rodriguez");
		empleadoApple.setSegundoApellido("Serrano");
		empleadoApple.setPuesto("Binario");
		empleadoApple.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}

}
