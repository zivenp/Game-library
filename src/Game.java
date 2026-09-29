public class Game {
private String title;
private String genre;
private String platform;
private double rating;
private String completionStatus;

Game(String title, String genre, String platform, double rating, String completionStatus) {
    this.title = title;
    this.genre = genre;
    this.platform = platform;
    this.rating = rating;
    this.completionStatus = completionStatus;

}



// access priavte variables
public String getTitle(){return title;}
public String getGenre(){ return genre;} 
public String getPlatform(){ return platform;}
public double getRating() {return rating;}
public String getStatus(){ return completionStatus;}


//  change rating 
public void setRating(double rating){
  this.rating=rating;
}


public String toString() {
    return "Title: " + title + ", Genre: " + genre + ", Platform: " + platform + ", Rating: " + rating + ", Completion Status: " + completionStatus;
}


}

