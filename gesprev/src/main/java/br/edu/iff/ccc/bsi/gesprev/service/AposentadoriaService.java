package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.repository.AposentadoriaRepository;
import br.edu.iff.ccc.bsi.gesprev.entities.Aposentadoria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AposentadoriaService {
    
    private AposentadoriaRepository apoRep;
    
    // Injeção via construtor (recomendado)
    public AposentadoriaService(AposentadoriaRepository apoRep) {
        this.apoRep = apoRep;
    }
    
    // CRUD básico
    
    public Aposentadoria salvar(Aposentadoria aposentadoria) {
        return apoRep.save(aposentadoria);
    }
    
    public List<Aposentadoria> listarTodos() {
        return apoRep.findAll();
    }
    
    public Optional<Aposentadoria> buscarPorId(Long id) {
        return apoRep.findById(id);
    }
    
    public void deletar(Long id) {
        apoRep.deleteById(id);
    }
    
    // Método melhorado com tratamento de exceção
    public Aposentadoria buscarOuFalhar(Long id) {
        return apoRep.findById(id)
                   .orElseThrow(() -> new RuntimeException("Aposentadoria não encontrada com ID: " + id));
    }
    
    // Outros métodos úteis podem ser adicionados conforme necessidade
}