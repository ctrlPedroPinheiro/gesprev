package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Pensao;
import br.edu.iff.ccc.bsi.gesprev.repository.PensaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PensaoService {

    private PensaoRepository pensaoRepository;

    public PensaoService(PensaoRepository pensaoRepository) {
        this.pensaoRepository = pensaoRepository;
    }

    // CRUD básico
    
    public Pensao salvar(Pensao pensao) {
        return pensaoRepository.save(pensao);
    }

    public List<Pensao> listarTodas() {
        return pensaoRepository.findAll();
    }

    public Optional<Pensao> buscarPorId(Long id) {
        return pensaoRepository.findById(id);
    }

    public void deletar(Long id) {
        pensaoRepository.deleteById(id);
    }

    // Método com tratamento de exceção
    public Pensao buscarOuFalhar(Long id) {
        return pensaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pensão não encontrada com ID: " + id));
    }
    
    // Métodos específicos para Pensão
}
