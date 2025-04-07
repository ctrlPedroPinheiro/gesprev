package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Contracheque;
import br.edu.iff.ccc.bsi.gesprev.repository.ContrachequeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ContrachequeServiceTest {

    @InjectMocks
    private ContrachequeService contrachequeService;

    @Mock
    private ContrachequeRepository contrachequeRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em ContrachequeService com sucesso.")
    void testBuscarPorId() {
        Contracheque contrachequeMock = new Contracheque();
        contrachequeMock.setId(1L);

        when(contrachequeRepository.findById(1L)).thenReturn(Optional.of(contrachequeMock));

        Contracheque result = contrachequeService.buscarOuFalhar(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        verify(contrachequeRepository).findById(1L);
    }
}
