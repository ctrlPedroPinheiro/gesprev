package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.repository.AposentadoriaRepository;
import java.util.Optional;
import br.edu.iff.ccc.bsi.gesprev.entities.Aposentadoria;

public class AposentadoriaService {
	
	private AposentadoriaRepository apoRep;
	
	public Optional<Aposentadoria> findById(Long id) {
		Optional<Aposentadoria> aposentadoria = Optional.ofNullable(apoRep.findById(id).orElseThrow(null));
		return aposentadoria;
	}
}
