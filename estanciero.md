# Experiencia de Usuario - Juego de Estanciero

### Menús de Navegación
- **Login:** Donde el usuario inicia sesión.
- **Menú principal:** Se podrá seleccionar dificultad, reanudar partida y salir.
    - Nuevo juego.
    - Dificultad del juego
        - Fácil
        - Moderado
        - Difícil
    - Reanudar partida.
        - Seleccionar partida a reanudar.
    - Salir del juego.
- **Menú de opciones de juego.**
    - Guardar partida.
    - Salir de la partida.
- **Menú acciones del juego:** Se listaran las acciones que puede realizar un jugador.
- **Menú Fin del juego:** Una vez terminada, se mostrará al ganador la partida permitirá seleccionar:
    - Volver al menú.

### Acciones
Consideramos acciones a las decisiones del jugador, en función de sus posibilidades.

- Comprar propiedades.
- Construir chacras/estancias.
- Compra/venta propiedades con otros jugadores.
- Tirar los dados para avanzar en el tablero.
- Activar cartas de la suerte o del destino, si las tienes implementadas.
- Compra y venta de chacras/estancias al banco.
- Poder quedarse en la casilla de descanso.
- Decisión de intentar quedarse o salir de la carcel.
  
### Eventos
Los eventos ocurren automáticamente luego de que el jugador tire los dados sin darle opción de elección del mismo.
- Caer en una propiedad que no está comprada.
- Caer en una propiedad de otro jugador y pagar alquiler.
- Pasar por la casilla de salida y recoger dinero.
- Caer en una casilla de impuestos o multa.
- Caer en una casilla de suerte o destino.
- Caer en una casilla de marche preso.
- Cobro y pago de premios/impuestos de banco.

### Presentaciones:

**Tablero de juego:** 
  
- Por cuestiones de las limitaciones de la consola se mostrara de a una casilla a la vez la cual sera la que le toco al jugador luego de lanzar los dados.
Se mostrara la informacion pertintente por medio de texto en la consola y caracteres espaciales para hacer mas entendible el juego.

**Menús:** 

- El menu será como los clásicos menues de consola hecho con un switch en el cual el usuario ingresará una opción numérica por consola de las cuales ofrece el menu.

**Cartas:** 

Tanto las cartas como casillas se mostraran con información de texto por consola y caracteres especiales para hacer mas clara y estetica su visualización. 

----

# Flujo de juego

## Preparación del juego:

1. Se selecciona la dificultad del juego (Fácil, Medio o Difícil), lo que define la cantidad y el tipo de jugadores que controlará el programa.
2. Se reparte 1 ficha por cada jugador, que lo representará en el tablero, y el banco entrega $35000 a cada uno para comenzar el juego.
3. Se colocan las cartas de suerte y destino en los mazos, y todas las escrituras comienzan siendo propiedad del banco, es decir que ningún jugador posee propiedades al comienzo del juego
4. Se tiran los dados para definir el orden en el que van a jugar los participantes, comenzando por el más alto.


## Comienzo:

1. Antes de tirar los dados, el jugador puede, si así lo desea y es posible, realizar todas las operaciones de compra de chacras y estancias.
2. El jugador que comienza, tira los dados, y empezando desde el casillero SALIDA, se adelanta con la pieza tantas casillas como muestran los dados. 
3. Una vez cae en un casillero, puede efectuar distintas acciones según el tipo de casilla en el que cae.
- **Casillero Suerte/Destino:** el jugador obtiene una tarjeta del mazo correspondiente, realiza la acción que esta le indica, y luego la vuelve a colocar al final del mazo.
- **Casillero Zona (provincia), Ferrocarril o Compañía:**
    - Si no han sido adquiridos por otro jugador, puede comprar la escritura correspondiente al casillero por el valor indicado en el tablero.
    - Si ya es propiedad de otro jugador, tiene que pagar alquiler de acuerdo a lo indicado en la escritura del mismo. (ver diferentes tipo de alquiler).
- **Casillero Premio/Impuesto:** El jugador debe pagar al banco o cobrar del mismo el monto que se especifica en el tablero.
- **Comisaría:** Esta casilla detiene al jugador, que para salir tiene tres posibilidades:
    1. Pagar la suma de $1000
    2. Poseer y utilizar una tarjeta de Suerte o Destino que lo libere
    3. Sacar doble al tirar los dados nuevamente
- **Descanso:** Al llegar a esta casilla, el jugador tiene derecho, si así lo desea, de quedarse por dos vueltas, siempre que no saque doble en los dados. Es condición de avisar antes de tirar los dados si se desea quedar
- **Estacionamiento Libre:** Esta casilla no tiene ninguna funcionalidad, por lo que no tiene derecho a quedarse el jugador
- **Marche Preso:** Al caer en esta casilla, el jugador debe retroceder hacia la comisaría (digo retroceder ya que no debe cobrar los $5000 que se otorgan al comenzar una nueva vuelta de tablero)
- **Salida:** El caer en esta casilla, tampoco tiene ninguna funcionalidad. Es al pasar por ella, es decir, el jugador completa una vuelta, que debe cobrar $5000 del banco.

**Aclaración**: Si a un jugador le faltan valores para responder al pago de alquileres o impuestos, tendrá que vender sus estancias o chacras al banco, hipotecar sus propiedades o entregar estas al acreedor. Si con estas acciones no puede completar el pago del alquiler o impuesto, es declarado en quiebra y tiene que retirarse del juego.

4. Si en los dados sale doble (dos números iguales), el jugador debe repetir el turno. En caso de que esto ocurra una tercera vez, el jugador debe ir a la COMISARÍA y el turno continúa con el jugador siguiente.

5. Una vez el jugador no pueda realizar más acciones, el turno pasa al siguiente jugador en el orden previamente establecido, repitiendo los pasos desde el principio.

