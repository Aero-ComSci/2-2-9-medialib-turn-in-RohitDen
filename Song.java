public class Song {
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", Rating: " + rating;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void adjustRating(int r){
    if (r >= 1 && r <= 10){
      rating = r;
    }
  }

  public void setTitle(String t) {
    title = t;
  }

  public boolean equals(Song s){
    if (this.title.equals(s.title) && this.rating == s.rating) {
        return true;
    } else {
        return false;
    }
  }
}


