import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtestadoTest {

    @Test
    void deveRetornarNomeDoencaAtestado() {
        Atestado atestado = new Atestado();
        atestado.setDoenca("Dengue");

        assertEquals("Dengue", atestado.getDoenca());
    }

    @Test
    void deveRetornarCIDDoencaAtestado() {
        Atestado atestado = new Atestado();
        atestado.setDoenca("Dengue");

        assertEquals("A90", atestado.getCID());
    }
}