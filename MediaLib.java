/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public void addSong(Song s){
    song = s;
  }

  public String toString() 
  {
    //modify to show the attributes

    String info = "This book has been added: " + book;
    info += "\nThis movie has been added: " + movie;
    info += "\nThis song has been added: " + song;
    
    return info;
  }

  public Book getBook()
  {
  return book;
  }

  public void testBook(Book tester){
    tester.setTitle("A New Title");
    System.out.println("The new title of the book is: " + tester.getTitle());
  }

  public static String getOwner()
  {
    return "Baez";
  }

  public static int getNumberOfItems()
  {
    return 3;
  }
}
