/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static String owner = "Rohit";
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numEntries++;
      numBooks++;
    } 
    else
      System.out.println("You cannot add a new book: A book already exists");
  }
  
  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      numEntries++;
      numMovies++;
    }
    else
      System.out.println("You cannot add a new movie: A movie already exists");
  }
  
  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      numEntries++;
      numSongs++;
    }
    else
      System.out.println("You cannot add a new song: A song already exists");
  }

  public String toString() 
  {
    String info = "";
    
    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";
