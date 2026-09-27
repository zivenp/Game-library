import java.util.Scanner;

public class Client{
public static void main(String[] args) {
    GameLibrary gameLibrary = new GameLibrary();

    //creating welcome ui
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Welcome to the Game Library! Whats your name?");
    String name = scanner.nextLine();
    System.out.println("Hello " + name + "! Here are some games in the library:");
    scanner.close();


      //creation of gaming backlog
        Game game1 = new Game("Genshin Impact", "Action RPG", "PC and mobile", 9.5, "Ongoing");
        Game game2 = new Game("Hollow Knight", "Metroidvania", "PC", 8.5, "Completed");
        Game game3 = new Game("Elden Ring", "Action RPG", "PC", 9.5, "Completed");
        Game game4 = new Game("Sekiro", "Action RPG", "PC and console", 8.5, "Completed");
        

      //adding games to list
    gameLibrary.addGame(game1);
    gameLibrary.addGame(game2);
    gameLibrary.addGame(game3);
    gameLibrary.addGame(game4);



    //find game
    Game result = gameLibrary.findGame("Genshin Impact");

    if (result != null) {
        System.out.println(result);
    } else {
        System.out.println("Game not found.");
    }

    //displaying count of games and removing
    System.out.println("Before:");
    gameLibrary.displayGames(); 
    System.out.println("Number of games: "+ gameLibrary.countGames());
    gameLibrary.removeGame("Sekiro");

    System.out.println("after:");
    System.out.println("Number of games: "+ gameLibrary.countGames());
    gameLibrary.displayGames(); 

     PlayerProfile user1 = new PlayerProfile("ziven", game1);
     System.out.println(user1.getFavGame());
}


}