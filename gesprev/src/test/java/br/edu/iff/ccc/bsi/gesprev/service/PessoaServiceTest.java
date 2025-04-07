package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Pessoa;
import br.edu.iff.ccc.bsi.gesprev.repository.PessoaRepository;
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
public class PessoaServiceTest {

    @InjectMocks
    private PessoaService pessoaService;

    @Mock
    private PessoaRepository pessoaRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em PessoaService com sucesso.")
    void testBuscarPorId() {
        Pessoa pessoaMock = new Pessoa();
        pessoaMock.setCpf("12345678900");

        when(pessoaRepository.findById("12345678900")).thenReturn(Optional.of(pessoaMock));

        Optional<Pessoa> result = pessoaService.buscarPorId("12345678900");

        assertTrue(result.isPresent());
        assertEquals("12345678900", result.get().getCpf());
        verify(pessoaRepository).findById("12345678900");
    }
}
