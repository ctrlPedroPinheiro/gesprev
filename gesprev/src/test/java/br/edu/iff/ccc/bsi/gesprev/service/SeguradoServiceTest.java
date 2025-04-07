package br.edu.iff.ccc.bsi.gesprev.service;

import br.edu.iff.ccc.bsi.gesprev.entities.Segurado;
import br.edu.iff.ccc.bsi.gesprev.repository.SeguradoRepository;
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

@SuppressWarnings("unused")
@ExtendWith(MockitoExtension.class)
public class SeguradoServiceTest {

    @InjectMocks
    private SeguradoService seguradoService;

    @Mock
    private SeguradoRepository seguradoRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Busca por ID em SeguradoService com sucesso.")
    void testBuscarPorId() {
        Segurado seguradoMock = new Segurado();
        
    }
}
