package br.edu.iftm.extensaoSTS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.repositories.AtividadeRepository;

@Service
public class AtividadeService {

	@Autowired
	private AtividadeRepository repo;

	public Atividade buscar(Integer id) {
		Atividade atividade = repo.findById(id).get();
		return atividade;
	}
	
	public void salvar(Atividade atividade) {
		repo.save(atividade);
	}
	
	public List<Atividade> BucarALL() {
		return repo.findAll();
	}
	
	public void excluir (Integer id) {
		repo.deleteById(id);
	}
}
