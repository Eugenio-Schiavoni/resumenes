Player:
+ abstract startTurn()
+ abstract throwDice()
+ abstract doubleDice()
+ abstract buildRanch()
+ abstract sellRanch()

RealPlayer:
+ override startTurn()
+ override everything above (to do)
+ openOptionsMenu() [This would be where saving the game or exiting happens, suggestions for better method names are welcome]

BotPlayer:
+ override startTurn()
+ override everything above (to do)

Tile:
+ abstract performAction(Player player)

PropertyTile:
+ override performAction(Player player)
  + buyProperty(Player player)
  + chargeTax(Player player)

ServiceTile:
+ override performAction(Player player)
  + buyService(Player player)
  + chargeTax(Player player)

TrainTile:
+ override performAction(Player player)
  + buyProperty(Player player)
  + chargeTax(Player player)

PrisonTile:
+ override performAction(Player player) [This would be enterPrison()]
+ payBail(Player player)
+ boolean checkTurn(Player player)
  + boolean verifyNumberTurns(Player player)
  + boolean verifyDoubles(Player player)
+ leavePrison()

StartTile:
+ override performAction(Player player) [This would be detect if the player passed by start, because they don’t always land there]

ChanceTile:
+ override performAction(Player player)
  + drawCard(Card card)
  + showCard(Card card)
  + executeCard(Card card)

Dice:
+ int rollDice()
+ String showResult()

GameAdmin:
+ boolean saveGame(Board board)
+ List<Player> generateHardDifficulty()
+ List<Player> generateMediumDifficulty()
+ List<Player> generateEasyDifficulty()
+ Board loadGame(User user)

Bank:
+ void distributeMoney(List<Player> listPlayers)
+ sellProperty(Tile tile, Player player)
+ chargeTax(int amountToCharge, Player player)
+ mortgagedProperty()
+ sellFarms(Player player, PropertyTile tile)

Login:
+ boolean verifyUser()

Board:
+ void movePlayer(Player player, int numberOfTiles)
+ setPlayer(Player player) [This function would be used when loading the game]
+ shiftAssign()

Writing:
+ boolean changeOwner(Player newOwner, Tile tile)
+ boolean mortgage()

User:
+ loadSavedGames()

Card:
+ cardAction()

Register:
+ registerNewUser()
