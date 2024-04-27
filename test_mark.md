# Documentación de Interfaces del Juego Financiero

Este documento describe las interfaces y clases diseñadas para el juego financiero, detallando los métodos que cada una provee y la abstracción que representan dentro del sistema.

## Interfaces y Clases

### Jugador

- **Descripción**: Representa un jugador en el juego, definiendo la acción de comenzar un turno.
- **Métodos**:
  - `abstract empezarTurno()`: Método abstracto para iniciar el turno de un jugador.

### JugadorReal (extiende Jugador)

- **Descripción**: Representa un jugador humano en el juego.
- **Métodos**:
  - `override empezarTurno()`: Implementa la acción de comenzar un turno para un jugador real.
  - `abrirMenuDeOpciones()`: Presenta opciones como guardar juego o salir.

### JugadorBot (extiende Jugador)

- **Descripción**: Representa un jugador controlado por la computadora.
- **Métodos**:
  - `override empezarTurno()`: Implementa la acción de comenzar un turno para un bot.

### Casillero

- **Descripción**: Define un casillero en el tablero.
- **Métodos**:
  - `abstract realizarAccion(Jugador jugador)`: Método abstracto para realizar una acción específica cuando un jugador cae en un casillero.

### CasilleroPropiedad (extiende Casillero)

- **Descripción**: Representa un casillero de propiedad en el tablero.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Permite comprar la propiedad o cobrar impuesto.

### CasilleroServicio (extiende Casillero)

- **Descripción**: Representa un casillero de servicio como electricidad o agua.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Permite comprar el servicio o cobrar impuesto.

### CasilleroTren (extiende Casillero)

- **Descripción**: Representa un casillero de estación de tren.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Permite comprar la estación o cobrar impuesto.

### CasilleroPrision (extiende Casillero)

- **Descripción**: Representa el casillero de prisión.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Gestiona la entrada a prisión y acciones relacionadas.

### CasilleroInicio (extiende Casillero)

- **Descripción**: Representa el casillero de inicio en el tablero.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Detecta si el jugador pasa por el inicio.

### CasilleroSuerte (extiende Casillero)

- **Descripción**: Representa un casillero de suerte.
- **Métodos**:
  - `override realizarAccion(Jugador jugador)`: Permite sacar y ejecutar tarjetas de suerte.

### Dados

- **Descripción**: Utilidad para lanzar dados en el juego.
- **Métodos**:
  - `lanzarDados()`: Retorna el resultado de lanzar los dados.
  - `mostrarResultado()`: Devuelve una cadena que representa el resultado de los dados.

### AdministrarJuego

- **Descripción**: Clase para gestionar aspectos del juego como guardar y cargar partidas.
- **Métodos**:
  - `guardarJuego(Tablero tablero)`: Guarda el estado actual del juego.
  - `cargarJuego(Usuario usuario)`: Carga un juego guardado.

### Banco

- **Descripción**: Gestiona las transacciones financieras del juego.
- **Métodos**:
  - `repartirPlata(List<Jugadores> listJugadores)`: Distribuye dinero inicial a los jugadores.
  - `venderPropiedad(Casillero casillero, Jugador jugador)`: Gestiona la venta de propiedades.
  - `cobrarImpuesto(int cantCobrar, Jugador jugador)`: Cobra impuestos a los jugadores.

### Login

- **Descripción**: Gestiona la autenticación de usuarios.
- **Métodos**:
  - `comprobarUsuario()`: Verifica las credenciales del usuario.

### Tablero

- **Descripción**: Representa el tablero de juego.
- **Métodos**:
  - `moverJugador(Jugador jugador, int cantCasillas)`: Mueve al jugador en el tablero.
  - `establecerJugador(Jugador jugador)`: Establece un jugador en el tablero al cargar un juego.

### Escritura

- **Descripción**: Gestiona la escritura de documentos y propiedades.
- **Métodos**:
  - `cambiarPropietario(Jugador jugadorNuevoPropietario, Casillero casillero)`: Cambia el propietario de una propiedad.
  - `hipotecar()`: Gestiona las hipotecas de propiedades.

### Usuario

- **Descripción**: Representa a un usuario del juego.
- **Métodos**:
  - `cargarPartidasGuardadas()`: Carga partidas previamente guardadas.
