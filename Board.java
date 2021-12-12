import java.util.*;
import java.io.*;
class Board{
    private Dice dice;
    private Queue <Player> players;
    private HashMap<Integer,Snake> snakes;
    private HashMap<Integer,Ladder> ladders;
    private int boardSize;
    Board(int size,int diece,HashMap<Integer,Snake> snakes,HashMap<Integer,Ladder> ladders,Queue <Player> players){
        this.boardSize=size;
        this.snakes=snakes;
        this.ladders=ladders;
        this.players=players;
        if(diece==1){
            dice = new SingleDice();
        }
        else if(diece==2){
            dice = new TwoDice();
        }
    }
    public void startGame(){
        while(true){
            Player p = players.poll(); // To get each player to play
            int currLoc = p.getLocation();
            int newLoc = currLoc+dice.roll(); 
            if(newLoc<=boardSize){
                if(snakes.containsKey(newLoc)){ // Checking if we have snake at a new location of the player.
                    Snake sna = snakes.get(newLoc);
                    newLoc = sna.getEnd();
                }
                else if(ladders.containsKey(newLoc)){ // Checking if we have Ladder at a new location of the player.
                    Ladder la = ladders.get(newLoc);
                    newLoc = la.getEnd();
                }
                currLoc = newLoc;
                System.out.println(p.getName()+" has a rolled a dice and moved from "+p.getLocation()+" to "+currLoc);
                System.out.println();
                if(currLoc==boardSize){ // If the player reached the top most end of the board he will wins.
                    System.out.println(p.getName()+" has won the game!!!!");
                    break;
                }
                p.setLocation(newLoc);
            }
            players.add(p);
        }
    }
}