package br.edu.iftm.ExtensaoSTS.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/atividades")
public class AtividadeResouce {
	
	@RequestMapping (method=RequestMethod.GET)
	public String listar () {
		return "Rest ok";
	}
	

}
