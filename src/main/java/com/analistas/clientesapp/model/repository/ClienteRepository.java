package com.analistas.clientesapp.model.repository;
import com.analistas.clientesapp.model.entitis.Cliente;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

//crea los datos para vizualizarlos 
public class ClienteRepository {

private List<Cliente> clientes;
	
	public ClienteRepository() {

		clientes = new ArrayList<>();
		
		//crear coleccion Testing 
		//Borrar cuando se coneccte a una bd;

		clientes.add(new Cliente(1, "Rodriguez", "Neymar", LocalDate.parse("1996-08-21")));
		clientes.add(new Cliente(2, "Osvaldo", "Neymar", LocalDate.parse("1999-08-31")));
		clientes.add(new Cliente(3, "Julian", "Neymar", LocalDate.parse("1997-08-25")));

	}

	public void setClientes(List<Cliente> clientes){
		this.clientes = clientes;
	};

	public List<Cliente> getClientes() {
		
		return this.clientes;
		
	}

	public void addCliente(Cliente cliente){
		clientes.add(cliente);
	}
	
}
