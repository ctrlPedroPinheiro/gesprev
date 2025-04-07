package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Pessoa;
import br.edu.iff.ccc.bsi.gesprev.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PessoaService {

	private PessoaRepository pessoaRep;
	
	public PessoaService (PessoaRepository pessoaRep) {
		this.pessoaRep = pessoaRep;
	}
	
	public Pessoa salvar(Pessoa pessoa) {
        return pessoaRep.save(pessoa);
    }

    public List<Pessoa> listarTodos() {
        return pessoaRep.findAll();
    }

    public Optional<Pessoa> buscarPorId(String id) {
        return pessoaRep.findById(id);
    }

    public void deletar(String id) {
    	pessoaRep.deleteById(id);
    }
}
