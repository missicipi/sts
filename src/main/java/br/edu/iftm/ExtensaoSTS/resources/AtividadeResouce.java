package br.edu.iftm.ExtensaoSTS.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.ExtensaoSTS.domain.Atividade;

@RestController
@RequestMapping (value="/atividades")
public class AtividadeResouce {
	
	@RequestMapping (method=RequestMethod.GET)
	public List<Atividade> listar(){
		Atividade a1 = new Atividade(1,"visita tecnica dgd");
		Atividade a2 = new Atividade(2,"simpós");
		return Arrays.asList(a1,a2);
		
		
		
	}
	
	
	//@RequestMapping (method=RequestMethod.GET)
	//public String listar () {
	//	return "Rest ok";
	//}
	

}
