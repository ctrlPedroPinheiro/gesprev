package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Contracheque;
import br.edu.iff.ccc.bsi.gesprev.repository.ContrachequeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ContrachequeService {

    private final ContrachequeRepository contrachequeRepository;

    public ContrachequeService(ContrachequeRepository contrachequeRepository) {
        this.contrachequeRepository = contrachequeRepository;
    }

    public Contracheque salvar(Contracheque contracheque) {
        return contrachequeRepository.save(contracheque);
    }

    public List<Contracheque> listarTodos() {
        return contrachequeRepository.findAll();
    }

    public Optional<Contracheque> buscarPorId(Long id) {
        return contrachequeRepository.findById(id);
    }

    public void deletar(Long id) {
        contrachequeRepository.deleteById(id);
    }

    public Contracheque buscarOuFalhar(Long id) {
        return contrachequeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contracheque não encontrado com ID: " + id));
    }

}

