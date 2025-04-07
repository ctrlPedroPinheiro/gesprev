package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Pensao;
import br.edu.iff.ccc.bsi.gesprev.repository.PensaoRepository;
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
public class PensaoServiceTest {

    @InjectMocks
    private PensaoService pensaoService;

    @Mock
    private PensaoRepository pensaoRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Buscar por ID com sucesso em PensaoService")
    void testBuscarPorIdComSucesso() {
        Pensao pensaoMock = new Pensao();
        pensaoMock.setId(1L);

        when(pensaoRepository.findById(1L)).thenReturn(Optional.of(pensaoMock));

        Optional<Pensao> result = pensaoService.buscarPorId(1L);

        assertTrue(result.isPresent());
        assertEquals(1L, result.get().getId());
        verify(pensaoRepository).findById(1L);
    }

    @Test
    @DisplayName("Buscar pensão com falha deve lançar exceção")
    void testBuscarOuFalharComExcecao() {
        when(pensaoRepository.findById(999L)).thenReturn(Optional.empty());

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            pensaoService.buscarOuFalhar(999L);
        });

        assertEquals("Pensão não encontrada com ID: 999", ex.getMessage());
        verify(pensaoRepository).findById(999L);
    }
}
