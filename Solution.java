import java.util.*;
import java.io.*;
public class Solution{
    public static void main(String[] args){
        HashMap<Integer,Snake> snakes = new HashMap<Integer,Snake>();
        HashMap<Integer,Ladder> ladders = new HashMap<Integer,Ladder>();
        Queue <Player> players = new LinkedList<Player>(); // To store player details
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the board.....");
        int board_size = in.nextInt(); //To customize the board size
        System.out.println("Enter whether you want to play with single diece or two diece...");
        in.nextLine();
        int no_of_diece=in.nextInt(); // No.of dice
        in.nextLine();
        int sn = in.nextInt(); //Input of no of snakes
        for(int i=0;i<sn;i++){
            in.nextLine();
            int start = in.nextInt();
            int end = in.nextInt();
            Snake s = new Snake(start,end);
            snakes.put(start,s);
        }
        int l = in.nextInt(); // Input of no of ladders
        for(int i=0;i<l;i++){
            in.nextLine();
            int start = in.nextInt();
            int end = in.nextInt();
            Ladder le = new Ladder(start,end);
            ladders.put(start,le);
        }
        in.nextLine();
        int no_of_players = in.nextInt();
        in.nextLine();
        for(int i=0;i<no_of_players;i++){
            String str = in.nextLine();
            Player p = new Player(str);
            players.add(p);

        }
         Board b = new Board(board_size,no_of_diece,snakes,ladders,players); // creating a new board
         b.startGame(); // let's start the game..!!
    }
}