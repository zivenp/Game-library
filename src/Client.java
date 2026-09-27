
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client{
public static void main(String[] args) throws FileNotFoundException{
  System.out.println(new File("games.txt").getAbsolutePath());
    GameLibrary gameLibrary = new GameLibrary();
     gameLibrary.loadGames();
     gameLibrary.displayGames();

    //creating welcome ui
    /* 
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Welcome to the Game Library! Whats your name?");
    String name = scanner.nextLine();
    System.out.println("Hello " + name + "! Here are some games in the library:");
    scanner.close();
*/


      //creation of gaming backlog
     
        Game game2 = new Game("Hollow Knight", "Metroidvania", "PC", 8.5, "Completed");
       Game game3 = new Game("Cyberpunk 2077", "RPG", "PC", 7.5, "Not Completed");
        

      //adding games to list
   
    gameLibrary.addGame(game2);
    gameLibrary.addGame(game3);
     gameLibrary.saveGames();


   
    




    //find game
    // Game result = gameLibrary.findGame("Genshin Impact");

    /*
    //displaying count of games and removing
    System.out.println("Before:");
   
    System.out.println("Number of games: "+ gameLibrary.countGames());
    gameLibrary.removeGame("Sekiro");

    System.out.println("after:");
    System.out.println("Number of games: "+ gameLibrary.countGames());
    

     PlayerProfile user1 = new PlayerProfile("ziven", game1);
     System.out.println(user1.getFavGame());

    */    
}


}