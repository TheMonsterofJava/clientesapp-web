package com.analistas.clientesapp.model.entitis;

import java.time.LocalDate;

public class Cliente {
//Clase POJO: Playing old java objet: Clase basica de Java
	
	private int numero;
	private String apellido;
	private String nombre;
	private LocalDate fechaNacimiento;

	//Constructor por defecto:

	
	
	//En este pasamos los parametros:
	public Cliente(int numero, String apellido, String nombre, LocalDate fechaNacimiento) {
	
		this.numero = numero;
		this.apellido = apellido;
		this.nombre = nombre; 	
		this.fechaNacimiento = fechaNacimiento;
	
	}

	
	public void setNumero(int numero) {

		this.numero = numero;	
		
	}

	public int getNumero() {

		return this.numero;

	}

	public void setApellido(String apellido) {

		this.apellido = apellido;	
		
	}

	public String getApellido() {

		return this.apellido;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;	
		
	}

	public String getNombre() {

		return this.nombre;

	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	@Override
	public String toString() {

		return apellido + "  " + nombre;

	}
	
		
	
}
