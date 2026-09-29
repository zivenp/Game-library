
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client{
 public static void main(String[] args) throws FileNotFoundException{
  System.out.println(new File("games.txt").getAbsolutePath());
    GameLibrary gameLibrary = new GameLibrary();
     gameLibrary.loadGames();
     


    //creating welcome ui
    Scanner scanner = new Scanner(System.in); 
    int choice =1;
          while (choice != 5) {

     System.out.println("\n===- Welcome to your Game Library -===");
     System.out.println("1. Display games");
     System.out.println("2. Find a game");
     System.out.println("3. Add a game");
     System.out.println("4. Remove a game");
     System.out.println("5. Save and exit");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            //displaying all saved games
          if (choice == 1) {
               System.out.println("Number of games: " + gameLibrary.countGames());
               gameLibrary.displayGames();
            }


            // searching for specific game (case sensitive) 
            if(choice ==2){

    System.out.println("enter a game title to search");
    String title = scanner.nextLine();
      Game result = gameLibrary.findGame(title);
    if (result != null) {
            System.out.println("Game found:");
            System.out.println(result);
        } else {
            System.out.println("Game not found.");
        }

      }

      

      //adding games
      if(choice ==3){
         
    System.out.print("Enter game title: ");
    String title = scanner.nextLine();

    System.out.print("Enter genre: ");
    String genre = scanner.nextLine();

    System.out.print("Enter platform: ");
    String platform = scanner.nextLine();

    System.out.print("Enter rating: ");
    double rating = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter status: ");
    String status = scanner.nextLine();

    Game game = new Game(title, genre, platform, rating, status);

    gameLibrary.addGame(game);

    System.out.println("Game added!");
      }

    

 }

      
   gameLibrary.saveGames();
        scanner.close();
         System.out.println("Library saved. Goodbye!");
}
}