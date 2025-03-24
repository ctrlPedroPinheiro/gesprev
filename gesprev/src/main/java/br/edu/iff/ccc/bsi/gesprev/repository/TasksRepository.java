package br.edu.iff.ccc.bsi.gesprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.iff.ccc.bsi.gesprev.entities.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long>{

}
