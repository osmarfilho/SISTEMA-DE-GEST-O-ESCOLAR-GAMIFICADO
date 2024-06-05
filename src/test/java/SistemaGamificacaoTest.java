package test.java;

import main.java.Desafio;
import main.java.Recompensa;
import main.java.TipoRecompensa;
import main.java.SistemaGamificacao;
import main.java.Estatisticas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class SistemaGamificacaoTest {

    @BeforeEach
    public void setUp() {
        sistema = new SistemaGamificacao();
    }
    private SistemaGamificacao sistema;

    @Test
    public void testAdicionarDesafio() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        sistema.adicionarDesafio(desafio);
        assertEquals(1, sistema.getDesafios().size());
        assertEquals("Desafio1", sistema.getDesafios().get(0).getTitulo());
    }

    @Test
    public void testAdicionarDesafioInvalido() {
        Desafio desafio = new Desafio(1, "", "Descricao invalida", -10);
        sistema.adicionarDesafio(desafio);
        assertEquals(0, sistema.getDesafios().size());
    }

    @Test
    public void testAdicionarRecompensa() {
        Recompensa recompensa = new Recompensa(1, "Recompensa1", TipoRecompensa.OURO);
        sistema.adicionarRecompensa(recompensa);
        assertEquals(1, sistema.getRecompensas().size());
        assertEquals("Recompensa1", sistema.getRecompensas().get(0).getDescricao());
    }

    @Test
    public void testVisualizarEstatisticas() {
        Estatisticas estatisticas = sistema.visualizarEstatisticas();
        assertNotNull(estatisticas);
    }

    @Test
    public void testGetDesafios() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        sistema.adicionarDesafio(desafio);
        assertEquals(1, sistema.getDesafios().size());
    }

    @Test
    public void testGetRecompensas() {
        Recompensa recompensa = new Recompensa(1, "Recompensa1", TipoRecompensa.OURO);
        sistema.adicionarRecompensa(recompensa);
        assertEquals(1, sistema.getRecompensas().size());
    }


}