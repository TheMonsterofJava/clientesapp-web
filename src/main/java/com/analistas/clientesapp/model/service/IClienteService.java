package com.analistas.clientesapp.model.service;

import java.util.List;

import com.analistas.clientesapp.model.entitis.Cliente;

public interface IClienteService {

	//Ya nos da la pauta para cpor crear el codigo
	public List<Cliente> buscarTodo();

	public Cliente buscarPorId(Integer id);

	public void guardar(Cliente cliente);

	public void borrar(Integer id); 

	
}
