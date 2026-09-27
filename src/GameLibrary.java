import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class GameLibrary{
    private ArrayList<Game> games;

 public GameLibrary() {
        games = new ArrayList<Game>();
    }
    public void addGame(Game game) {
        games.add(game);
    }

    public void displayGames(){
        for(Game game:games ){
            System.out.println(game);
        }
    }



  public Game findGame(String title){
  for(Game item: games){
    if(item.getTitle().equals(title)){
        return item;
    }
  }
   return null;
    }

 public boolean removeGame(String title){
  Game game = findGame(title);

  if(game!=null){
    games.remove(game);
    return true;
  }
 return false;
 }

 public int countGames(){
 int count=0;
    for(int i=0;i<games.size();i++){
    if(games.get(i)!=null){
    count++;
 }
 }
  return count;
 }

   // file i/o for printing games
   
    public void loadGames() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("games.txt"));

     while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

          if (line.isEmpty()) {
            continue;
        }
        
        String[] parts = line.split(",");

         Game game = new Game(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]), parts[4]);
  
        games.add(game);

    }
        scanner.close();
    }

    public void saveGames() throws FileNotFoundException {
    PrintWriter writer = new PrintWriter("games.txt");

    for (Game item : games) {
        writer.println(
         item.getTitle() + "," +
         item.getGenre() + "," +
         item.getPlatform() + "," +
         item.getRating() + "," +
         item.getStatus()
        );
    }

    writer.close();

    }


}