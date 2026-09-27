public class PlayerProfile {
    
    private String username;
    private Game favGame;

    PlayerProfile(String username, Game favGame){
        this.username=username;
        this.favGame=favGame; 
    }
    
    public String getFavGame(){
        return "Players favourite game is " + favGame.getTitle();
    }

}

