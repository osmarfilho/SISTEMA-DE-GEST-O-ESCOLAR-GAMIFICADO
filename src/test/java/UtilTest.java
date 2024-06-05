package test.java;

import main.java.Desafio;
import main.java.Participante;
import main.java.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void testCalcularPontos() {
        Participante participante = new Participante(1, "Teste Participante");
        Desafio desafio = new Desafio(1, "Teste Desafio", "Descrição do Teste", 100);
        participante.aceitarDesafio(desafio);
        int pontos = Util.calcularPontos(participante);
        assertEquals(100, pontos);
    }
}