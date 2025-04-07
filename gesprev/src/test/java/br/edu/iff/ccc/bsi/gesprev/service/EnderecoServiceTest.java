package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Endereco;
import br.edu.iff.ccc.bsi.gesprev.repository.EnderecoRepository;
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
public class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService enderecoService;

    @Mock
    private EnderecoRepository enderecoRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em EnderecoService com sucesso.")
    void testBuscarPorId() {
        Endereco enderecoMock = new Endereco();
        enderecoMock.setId(1L);

        when(enderecoRepository.findById(1L)).thenReturn(Optional.of(enderecoMock));

        Endereco result = enderecoService.buscarOuFalhar(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        verify(enderecoRepository).findById(1L);
    }
}
