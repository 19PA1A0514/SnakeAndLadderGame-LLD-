# SnakeAndLadderGame-LLD-
**Problem Statement**
Create a snake and ladder application. The application should take as input (from the command line or a file):

Number of snakes (s) followed by s lines each containing 2 numbers denoting the head and tail positions of the snake.

Number of ladders (l) followed by l lines each containing 2 numbers denoting the start and end positions of the ladder.

Number of players (p) followed by p lines each containing a name.

After taking these inputs, you should print all the moves in the form of the current player name followed by a random number between 1 to 6 denoting the die roll and the initial and final position based on the move.

Format: <player_name> rolled a <dice_value> and moved from <initial_position> to <final_position>

When someone wins the game, print that the player won the game.

Format: <player_name> wins the game

**Rules of the game**
1.The game will have 100 cells numbered from 1 to 100.
2.It has a dice numbered from 1 to 6.
3.There can be n no.of players and Intially each player is at 0(Outside of the board).
4.When each player turns comes they will roll a dice and move forward based on the number on the dice.
5.While they move forward in between there are Snakes and Ladders.
6.Snake wil have a head and tail.Head at higher number and tail at lower number.
7.If a player enters a cell which has a head of the snake the player should go down to the position of tail of that snake.
8.Ladder have a start at low position and end at high position.
9.If a player enters a cell which has a start of the ladder he will move to higher position(End of the ladder).
10.If any player reaches the end of the board, he will wins.
