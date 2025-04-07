package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.repository.TasksRepository;
import br.edu.iff.ccc.bsi.gesprev.entities.Tasks;

public class TasksService {
	private TasksRepository TaskRep;
	
	public Tasks findById(long id) {
	    return TaskRep.findById(id)
	            .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com ID: " + id));
	}

}
