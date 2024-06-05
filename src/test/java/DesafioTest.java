package test.java;

import main.java.Participante;
import main.java.Desafio;
import main.java.DesafioInvalidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesafioTest {

    @Test
    public void testCompletarDesafio() {
        Participante participante = new Participante(1, "Participante1");
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        desafio.completarDesafio(participante);
        assertEquals(100, participante.getPontos());
        assertTrue(participante.getDesafiosCompletos().contains(desafio));
    }

    @Test
    public void testValidarDesafioValido() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        assertDoesNotThrow(desafio::validarDesafio);
    }

    @Test
    public void testValidarDesafioInvalido() {
        Desafio desafio = new Desafio(1, "", "", -10);
        assertThrows(DesafioInvalidoException.class, desafio::validarDesafio);
    }

    @Test
    public void testGetId() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        assertEquals(1, desafio.getId());
    }

    @Test
    public void testGetTitulo() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        assertEquals("Desafio1", desafio.getTitulo());
    }

    @Test
    public void testGetDescricao() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        assertEquals("Descricao1", desafio.getDescricao());
    }

    @Test
    public void testGetPontos() {
        Desafio desafio = new Desafio(1, "Desafio1", "Descricao1", 100);
        assertEquals(100, desafio.getPontos());
    }
}