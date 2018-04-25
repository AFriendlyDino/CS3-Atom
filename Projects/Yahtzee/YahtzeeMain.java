import java.util.Scanner;
import java.util.ArrayList;
public class YahtzeeMain{
  public static void main(String[] yooooooooooooooooooooooooooooooot){
    Scanner kys = new Scanner(System.in);
    System.out.println("Enter the names of the players, and then enter 0 to finish the list of players");
    String player = "";
    ArrayList<String> playernames = new ArrayList<String>();
    while(!player.equals("0")){
      player = kys.next();
      playernames.add(player);
    }
    ArrayList<Player> playerlist = new ArrayList<Player>();
    for(int i = 0; i < playernames.size(); i++){
      playerlist.add(new Player(playernames.get(i)));
    }
    for(int i = 0; i < playerlist.size(); i++){
      while(!playerlist.get(i).isFinished()){
        playerlist.get(i).play();
      }
    }
    System.out.println("The game is finished");
  }
}
