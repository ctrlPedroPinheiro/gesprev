package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Aposentadoria;
import br.edu.iff.ccc.bsi.gesprev.repository.AposentadoriaRepository;
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
public class AposentadoriaServiceTest {

    @InjectMocks
    private AposentadoriaService aposentadoriaService;

    @Mock
    private AposentadoriaRepository aposentadoriaRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em AposentadoriaService com sucesso.")
    void testBuscarPorId() {
        Aposentadoria aposentadoriaMock = new Aposentadoria();
        aposentadoriaMock.setId(1L);

        when(aposentadoriaRepository.findById(1L)).thenReturn(Optional.of(aposentadoriaMock));

        Aposentadoria result = aposentadoriaService.buscarOuFalhar(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        verify(aposentadoriaRepository).findById(1L);
    }
}
