package br.edu.iff.ccc.bsi.gesprev.service;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import br.edu.iff.ccc.bsi.gesprev.entities.Tasks;
import br.edu.iff.ccc.bsi.gesprev.repository.TasksRepository;


@ExtendWith(MockitoExtension.class)
public class TasksServiceTest {
    
    @InjectMocks
    private TasksService taskService;
    
    @Mock
    private TasksRepository taskRepo;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
    
    
    @Test
    @DisplayName("Busca por Id em TasksService com sucesso.")
    void testFindById() {
        //cenário
         Tasks mockedTask = new Tasks(1L,"DevTests", "Dev Unit Tests", false);
         when(taskRepo.findById(1L)).thenReturn(Optional.of(mockedTask));
        
        // ação
        Tasks result = taskService.findById(1L);
        
        // verificação
        assertNotNull(result);
        assertEquals("DevTests", result.getName());
        assertEquals("Dev Unit Tests", result.getDescription());
        verify(taskRepo).findById(1L); //Verifica se o método findById foi chamado
        
    }

}