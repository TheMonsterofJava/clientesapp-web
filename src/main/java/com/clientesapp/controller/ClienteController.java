package com.clientesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analistas.clientesapp.model.entitis.Cliente;

import com.analistas.clientesapp.model.service.IClienteService;

@Controller
@RequestMapping({"", "/clientes"})
public class ClienteController {
	
	//static ClienteServiceImpl clienteService = new ClienteServiceImpl();
	
	//Invercion de Control: Uso la interface como referencia en el codigo (Es los mas practico)
	
	
	@Autowired //Coneccion Automatica Ioc impementado, Inversion de Control.
	IClienteService clienteService; //Creo una instancia de la interface y puedo accseder a estas, Yo dejo que la interface me llame. 
	List<Cliente> clientes; 

	@GetMapping({"", "/list"})
	public String listar(Model m) {
		
		clientes = clienteService.buscarTodo();

		//Cargamos Los Clientes.
		m.addAttribute("titulo", "Listado de Clientes");
		m.addAttribute("clientes", clientes);
		
		return "clientes/list";
		
		
		
	}
	
	
}
