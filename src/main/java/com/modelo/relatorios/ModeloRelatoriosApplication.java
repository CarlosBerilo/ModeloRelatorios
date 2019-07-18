package com.modelo.relatorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.modelo.relatorios.model.Cliente;
import com.modelo.relatorios.service.ClientesRelatorios;

@SpringBootApplication
public class ModeloRelatoriosApplication {

	public static void main(String[] args) {
		
				
		String path = ModeloRelatoriosApplication.class.getResource("").getPath().toString().replace("/target/classes/com/modelo/relatorios/", "");
		System.out.println(path);
		
		try {
		
	    List<Cliente> listClientes = new ArrayList<Cliente>();
		
		Cliente Enoque = new Cliente();
		Enoque.setNome("Enoque da Silva");
		Enoque.setEndereco("R- Salomão , 45200");
		Enoque.setComplemento("andar 3");
		Enoque.setTelefone("(99) 9999-9999");
		Enoque.setUf("CE");
		
		Cliente Saladino = new Cliente();
		Saladino.setNome("Saladino Teixeira");
		Saladino.setEndereco("R- Salomão , 45200");
		Saladino.setComplemento("andar 6");
		Saladino.setTelefone("(99) 9999-9999");
		Saladino.setUf("CE");
		
		Cliente Pedro = new Cliente();
		Pedro.setNome("Pedro Farias");
		Pedro.setEndereco("R- Salomão , 45200");
		Pedro.setComplemento("andar 9");
		Pedro.setTelefone("(99) 9999-9999");
		Pedro.setUf("CE");
		
		Cliente Lucas = new Cliente();
		Lucas.setNome("Lucas Farias");
		Lucas.setEndereco("R- Salomão , 45200");
		Lucas.setComplemento("andar 12");
		Lucas.setTelefone("(99) 9999-9999");
		Lucas.setUf("CE");
		
		
		listClientes.add(Enoque);
		listClientes.add(Saladino);
		listClientes.add(Pedro);
		listClientes.add(Lucas);
		
		ClientesRelatorios clientesRelatorios = new ClientesRelatorios();
		clientesRelatorios.imprimirRelatorio(path, listClientes);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
