package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Segurado;
import br.edu.iff.ccc.bsi.gesprev.repository.SeguradoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SeguradoService {

    private final SeguradoRepository seguradoRepository;

    public SeguradoService(SeguradoRepository seguradoRepository) {
        this.seguradoRepository = seguradoRepository;
    }

    public Segurado salvar(Segurado segurado) {
        return seguradoRepository.save(segurado);
    }

    public List<Segurado> listarTodos() {
        return seguradoRepository.findAll();
    }

    public Optional<Segurado> buscarPorId(String id) {
        return seguradoRepository.findById(id);
    }

    public void deletar(String id) {
        seguradoRepository.deleteById(id);
    }

    public Segurado buscarOuFalhar(String id) {
        return seguradoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Segurado não encontrado com ID: " + id));
    }

}
