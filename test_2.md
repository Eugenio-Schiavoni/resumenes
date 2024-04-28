# Game Structure

## Interfaces and Classes

### Player
- **Abstract Methods:**
  + `startTurn()`: Starts the player's turn.
  + `throwDice()`: Simulates throwing dice.
  + `doubleDice()`: Handles the scenario of throwing double on dice.
  + `buildRanch()`: Allows building a ranch on properties.
  + `sellRanch()`: Handles selling a ranch.

### RealPlayer (extends Player)
- **Methods:**
  + `startTurn()`: Implementation of starting the turn for a real player.
  + `openOptionsMenu()`: Opens a menu with options such as save or exit.

### BotPlayer (extends Player)
- **Methods:**
  + `startTurn()`: Implementation of starting the turn for a bot player.

### Tile
- **Abstract Method:**
  + `performAction(Player player)`: Defines the action performed when a player lands on a tile.

### PropertyTile (extends Tile)
- **Methods:**
  + `buyProperty(Player player)`: Allows a player to buy the property.
  + `chargeTax(Player player)`: Charges tax to the player.

### ServiceTile (extends Tile)
- **Methods:**
  + `buyService(Player player)`: Allows a player to buy services.
  + `chargeTax(Player player)`: Charges service tax to the player.

### TrainTile (extends Tile)
- **Methods:**
  + `buyProperty(Player player)`: Allows purchasing of train stations.
  + `chargeTax(Player player)`: Charges tax related to train stations.

### PrisonTile (extends Tile)
- **Methods:**
  + `enterPrison()`: Handles the player entering prison.
  + `payBail(Player player)`: Allows a player to pay bail.
  + `checkTurn(Player player)`: Checks conditions for a player's turn in prison.
    - `verifyNumberTurns(Player player)`: Verifies the number of turns spent in prison.
    - `verifyDoubles(Player player)`: Checks if the player throws doubles to leave prison.
  + `leavePrison()`: Handles leaving the prison.

### StartTile (extends Tile)
- **Method:**
  + `detectPassStart(Player player)`: Detects if a player passes the start tile.

### ChanceTile (extends Tile)
- **Methods:**
  + `drawCard(Card card)`: Draws a chance card.
  + `showCard(Card card)`: Displays the drawn card.
  + `executeCard(Card card)`: Executes the action specified on the chance card.

### Dice
- **Methods:**
  + `rollDice()`: Rolls the dice.
  + `showResult()`: Shows the result of the dice roll.

## Game Administration

### GameAdmin
- **Methods:**
  + `saveGame(Board board)`: Saves the current state of the game.
  + `generateDifficultyLevels()`: Generates players for different difficulty levels (Hard, Medium, Easy).
  + `loadGame(User user)`: Loads a game for a user.

### Bank
- **Methods:**
  + `distributeMoney(List<Player> listPlayers)`: Distributes starting money among players.
  + `sellProperty(Tile tile, Player player)`: Handles the sale of a property.
  + `chargeTax(int amountToCharge, Player player)`: Implements tax collection.
  + `mortgagedProperty()`: Manages mortgaged properties.
  + `sellFarms(Player player, PropertyTile tile)`: Handles the selling of farms.

### Login
- **Method:**
  + `verifyUser()`: Verifies if a user is registered.

### Board
- **Methods:**
  + `movePlayer(Player player, int numberOfTiles)`: Moves the player across the board.
  + `setPlayer(Player player)`: Sets the player in the game upon loading.

### Writing
- **Methods:**
  + `changeOwner(Player newOwner, Tile tile)`: Changes the owner of a tile.
  + `mortgage()`: Handles mortgaging of properties.

### User
- **Method:**
  + `loadSavedGames()`: Loads saved games for the user.

### Card
- **Method:**
  + `cardAction()`: Defines actions for game cards.

### Register
- **Method:**
  + `registerNewUser()`: Registers a new user.
