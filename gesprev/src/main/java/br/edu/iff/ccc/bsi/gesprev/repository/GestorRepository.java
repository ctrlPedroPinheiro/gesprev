package br.edu.iff.ccc.bsi.gesprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.iff.ccc.bsi.gesprev.entities.Gestor;

public interface GestorRepository extends JpaRepository<Gestor, String> {
	
}
