import java.util.ArrayList;
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


}