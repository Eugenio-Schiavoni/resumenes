import org.example.Tablero;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TableroTest {
    private Tablero tablero;

    @Before
    public void setUp() {
        tablero = new Tablero();
    }

    @Test
    public void testInicializacionTablero() {
        char[][] esperado = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        for (int i = 0; i < 3; i++) {
            assertArrayEquals(esperado[i], tablero.getTablero()[i]);
        }
    }

    @Test
    public void testHacerMovimientoValido() {
        assertTrue(tablero.hacerMovimiento(0, 0, 'X'));
        assertEquals('X', tablero.getTablero()[0][0]);
    }

    @Test
    public void testHacerMovimientoInvalido() {
        tablero.hacerMovimiento(0, 0, 'X');
        assertFalse(tablero.hacerMovimiento(0, 0, 'O'));
        assertEquals('X', tablero.getTablero()[0][0]);
    }

    @Test
    public void testHayGanadorFila() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(0, 1, 'X');
        tablero.hacerMovimiento(0, 2, 'X');
        assertTrue(tablero.hayGanador('X'));
    }

    @Test
    public void testHayGanadorColumna() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(1, 0, 'X');
        tablero.hacerMovimiento(2, 0, 'X');
        assertTrue(tablero.hayGanador('X'));
    }

    @Test
    public void testHayGanadorDiagonal() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(1, 1, 'X');
        tablero.hacerMovimiento(2, 2, 'X');
        assertTrue(tablero.hayGanador('X'));
    }

    @Test
    public void testHayGanadorAntiDiagonal() {
        tablero.hacerMovimiento(0, 2, 'X');
        tablero.hacerMovimiento(1, 1, 'X');
        tablero.hacerMovimiento(2, 0, 'X');
        assertTrue(tablero.hayGanador('X'));
    }

    @Test
    public void testNoHayGanador() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(0, 1, 'X');
        tablero.hacerMovimiento(1, 1, 'O');
        assertFalse(tablero.hayGanador('X'));
    }

    @Test
    public void testEstaLleno() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(0, 1, 'X');
        tablero.hacerMovimiento(0, 2, 'O');
        tablero.hacerMovimiento(1, 0, 'O');
        tablero.hacerMovimiento(1, 1, 'O');
        tablero.hacerMovimiento(1, 2, 'X');
        tablero.hacerMovimiento(2, 0, 'X');
        tablero.hacerMovimiento(2, 1, 'X');
        tablero.hacerMovimiento(2, 2, 'O');
        assertTrue(tablero.estaLleno());
    }

    @Test
    public void testNoEstaLleno() {
        tablero.hacerMovimiento(0, 0, 'X');
        tablero.hacerMovimiento(0, 1, 'X');
        tablero.hacerMovimiento(0, 2, 'O');
        assertFalse(tablero.estaLleno());
    }
}
