package test.java;

import main.java.Participante;
import main.java.Desafio;
import main.java.TipoRecompensa;
import main.java.Recompensa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParticipanteTest {
    private Participante participante;

    @BeforeEach
    public void setUp() {
        Participante.resetNumeroParticipantes();
        participante = new Participante(1, "João");
    }

    @Test
    public void testAceitarDesafio() {
        Desafio desafio = new Desafio(1, "Primeiro Desafio", "Descrição do primeiro desafio", 100);
        participante.aceitarDesafio(desafio);
        assertEquals(1, participante.getDesafiosCompletos().size());
        assertEquals(100, participante.getPontos());
    }

    @Test
    public void testAdicionarRecompensa() {
        Recompensa recompensa = new Recompensa(1, "Recompensa Bronze", TipoRecompensa.BRONZE);
        participante.adicionarRecompensa(recompensa);
        assertEquals(1, participante.getRecompensas().size());
    }

    @Test
    public void testGetPontos() {
        assertEquals(0, participante.getPontos());
        Desafio desafio = new Desafio(1, "Desafio Teste", "Descrição Teste", 50);
        participante.aceitarDesafio(desafio);
        assertEquals(50, participante.getPontos());
    }

    @Test
    public void testGetNumeroParticipantes() {
        Participante participante2 = new Participante(2, "Maria");
        assertEquals(2, Participante.getNumeroParticipantes());
    }
}