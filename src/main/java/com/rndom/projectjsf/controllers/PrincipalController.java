package com.rndom.projectjsf.controllers;
//Clase a controlar toda la pantalla principal

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.rndom.projectjsf.entity.Empleado;
import com.rndom.projectjsf.services.EmpleadoService;

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	
	//Metodo que se encarga de inicializar la info de la pantalla principal
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
