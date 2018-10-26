package br.edu.iftm.extensaoSTS.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.service.AtividadeService;

@RestController
@RequestMapping(value = "/atividades")
public class AtividadeResource {

	@Autowired
	private AtividadeService service;

	@GetMapping
	public ResponseEntity<?> listar() {
		try {
			List<Atividade> atividades = service.BucarALL();
			return ResponseEntity.ok(atividades);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		try {
			Atividade atividade = service.buscar(id);
			return ResponseEntity.ok(atividade);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@PostMapping("/")
	public ResponseEntity<?> save(@RequestBody Atividade atividade) {
		try {
			service.salvar(atividade);
			return ResponseEntity.ok(atividade);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Atividade>  delete(@PathVariable Integer id) {
		try {
			 service.excluir(id);
			 return new ResponseEntity<Atividade>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			 return new ResponseEntity<Atividade>(HttpStatus.BAD_REQUEST);
		}		
	}

}
