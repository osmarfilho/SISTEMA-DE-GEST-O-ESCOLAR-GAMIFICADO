package test.java;

import main.java.Estatisticas;
import main.java.Disciplina;
import main.java.Participante;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    private Disciplina disciplina;
    private Estatisticas estatisticas;

    @BeforeEach
    public void setUp() {
        disciplina = new Disciplina(1, "Matemática", "Disciplina de Matemática");
        estatisticas = new Estatisticas();
    }

    @Test
    public void testAtualizarEstatisticas() {
        Participante participante = new Participante(1, "Participante 1");
        participante.aceitarDesafio(new main.java.Desafio(1, "Desafio 1", "Descrição do desafio 1", 100));
        estatisticas.atualizarEstatisticas(participante);
        assertEquals(1, estatisticas.getTotalDesafiosCompletos());
        assertEquals(100, estatisticas.getTotalPontos());
    }

    @Test
    public void testGetId() {
        assertEquals(1, disciplina.getId());
    }

    @Test
    public void testGetNome() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testGetDescricao() {
        assertEquals("Disciplina de Matemática", disciplina.getDescricao());
    }
}
