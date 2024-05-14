import org.example.Tablero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    private Tablero tablero;

    @BeforeEach
    void setUp() {
        tablero = new Tablero();
    }

    @Test
    void testInicializacionTablero() {
        char[][] casillas = tablero.getCasillas();
        for (char[] fila : casillas) {
            for (char c : fila) {
                assertEquals(' ', c, "La casilla debería estar vacía al inicio.");
            }
        }
    }

    @Test
    void testRealizarJugadaUser() {
        assertTrue(tablero.realizarJugadaUser(0, 0), "La jugada debería ser exitosa.");
        assertFalse(tablero.realizarJugadaUser(0, 0), "La jugada no debería ser exitosa porque la casilla ya está ocupada.");
    }

    @Test
    void testEstaLleno() {
        assertFalse(tablero.estaLleno(), "El tablero no debería estar lleno inicialmente.");
        tablero.setCasillas(new char[][]{{'X', 'X', 'X'}, {'X', 'X', 'X'}, {'X', 'X', 'X'}});
        assertTrue(tablero.estaLleno(), "El tablero debería estar lleno.");
    }

    @Test
    void testRealizarJugadaBot() {
        assertTrue(tablero.realizarJugadaBot(), "La jugada del bot debería ser exitosa.");
    }

}
