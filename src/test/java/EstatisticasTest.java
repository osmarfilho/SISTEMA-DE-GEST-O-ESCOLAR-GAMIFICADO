package test.java;

import main.java.Desafio;
import main.java.Participante;
import main.java.Estatisticas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstatisticasTest {

    private Participante participante;
    private Estatisticas estatisticas;

    @BeforeEach
    public void setUp(){
        estatisticas = new Estatisticas();
        participante = new Participante(1, "Participante");
    }


    @Test
    public void testAtualizarEstatisticas() {
        Desafio desafio = new Desafio(1, "Teste Desafio", "Descrição do Teste", 100);
        participante.aceitarDesafio(desafio);
        estatisticas.atualizarEstatisticas(participante);
        assertEquals(1, estatisticas.getTotalDesafiosCompletos());
        assertEquals(100, estatisticas.getTotalPontos());
    }

    @Test
    public void testVisualizarEstatisticas() {
        estatisticas.atualizarEstatisticas(participante);
        estatisticas.visualizarEstatisticas();
        assertEquals(0, estatisticas.getTotalDesafiosCompletos());
        assertEquals(0, estatisticas.getTotalPontos());
    }
}