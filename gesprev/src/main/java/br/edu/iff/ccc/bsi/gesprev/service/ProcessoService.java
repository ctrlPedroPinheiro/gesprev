package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Processo;
import br.edu.iff.ccc.bsi.gesprev.repository.ProcessoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProcessoService {

    private ProcessoRepository processoRepository;

    public ProcessoService(ProcessoRepository processoRepository) {
        this.processoRepository = processoRepository;
    }

    // Operações CRUD básicas
    
    public Processo salvar(Processo processo) {
        return processoRepository.save(processo);
    }

    public List<Processo> listarTodos() {
        return processoRepository.findAll();
    }

    public Optional<Processo> buscarPorId(Long id) {
        return processoRepository.findById(id);
    }

    public void deletar(Long id) {
        processoRepository.deleteById(id);
    }

    // Método com tratamento de exceção
    public Processo buscarOuFalhar(Long id) {
        return processoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Processo não encontrado com ID: " + id));
    }

}