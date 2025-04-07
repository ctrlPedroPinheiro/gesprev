package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Processo;
import br.edu.iff.ccc.bsi.gesprev.repository.ProcessoRepository;
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
public class ProcessoServiceTest {

    @InjectMocks
    private ProcessoService processoService;

    @Mock
    private ProcessoRepository processoRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em ProcessoService com sucesso.")
    void testBuscarPorId() {
        Processo processoMock = new Processo();
        processoMock.setId(1L);

        when(processoRepository.findById(1L)).thenReturn(Optional.of(processoMock));

        Optional<Processo> result = processoService.buscarPorId(1L);

        assertTrue(result.isPresent());
        assertEquals(1L, result.get().getId());
        verify(processoRepository).findById(1L);
    }

    @Test
    @DisplayName("Busca por ID com falha em ProcessoService deve lançar exceção.")
    void testBuscarOuFalhar_DeveLancarExcecao() {
        when(processoRepository.findById(99L)).thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            processoService.buscarOuFalhar(99L);
        });

        assertEquals("Processo não encontrado com ID: 99", exception.getMessage());
        verify(processoRepository).findById(99L);
    }
}
