public class Movie {
  private String title;
  private int duration;
  private int rating;
 
  /*** Constructor ****/
  public Movie(String t, int d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getDuration() {
    return duration;
  }
 
  public int getRating() {
    return rating;
  }
 
  public String toString()
  {
    String info = "\"" + title + "\", duration is " + duration;
    if (rating != 0)
    {
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void adjustRating(int r) {
    if (r>=1 && r<=10){
          rating = r;
    }
  }
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(int d) {
    duration = d;
  }
  public boolean equals(Movie m)
  {
    if (this.title.equals(m.title) && this.duration ==(m.duration)) {
      return true;
    }
    return false;
  }
}

