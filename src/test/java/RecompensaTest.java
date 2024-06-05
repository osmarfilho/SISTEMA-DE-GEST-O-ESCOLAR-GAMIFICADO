package test.java;

import main.java.Participante;
import main.java.Recompensa;
import main.java.TipoRecompensa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecompensaTest {

    @Test
    public void testAtribuirRecompensa() {
        Participante participante = new Participante(1, "Participante1");
        Recompensa recompensa = new Recompensa(1, "Recompensa1", TipoRecompensa.OURO);
        recompensa.atribuir(participante);
        assertTrue(participante.getRecompensas().contains(recompensa));
    }

    @Test
    public void testGetTipo() {
        Recompensa recompensa = new Recompensa(1, "Recompensa1", TipoRecompensa.OURO);
        assertEquals(TipoRecompensa.OURO, recompensa.getTipo());
    }
}