import java.util.ArrayList;
/**
 * Katrina Balestino
 * Amber Kirk
 */
public class MovieListModel {
    private final ArrayList<MovieInfo> movieList;
    private final ArrayList<String> genreList;
	
    public MovieListModel()
    {
        movieList = new ArrayList();
        addMovietoList();
        genreList = new ArrayList();
        addGenreToList();
    }
        
    //Create movie ArrayLists based on genres
    private void addMovietoList()
    {
        //Fantasy
        getMoviefromList().add(new MovieInfo(new String[] {"Avengers: Infinity War", "PG-13", "Chris Evans, Robert Downey Jr.", "April 27, 2018"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Harry Potter", "PG", "Daniel Radcliffe, Rupert Gint", "November 16, 2001"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Spider-man Homecoming", "PG-13", "Tom Holland, Michael Keaton", "July 7, 2017"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Pirates of the Caribbean", "PG-13", "Johnny Deep, Orlando Bloom", "July 9, 2003"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Wonder Woman", "PG-13", "Gal Gadot, Chris Pine", "June 2, 2017"}));

        //Animated
        getMoviefromList().add(new MovieInfo(new String[] {"Finding Nemo", "G", "Albert Brooks, Ellen DeGeneres", "May 30, 2003"}));
        getMoviefromList().add(new MovieInfo(new String[] {"The Incredibles", "PG", "Craig T. Nelson, Samuel L. Jackson", "November 5, 2004"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Despicable Me", "PG", "Steve Carell, Jason Segel", "July 9, 2010"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Wall-E", "G", "Ben Burtt, Elissa Knight", "June 27, 2008"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Beauty and the Beast", "G", "Paige O’Hara, Robby Benson", "November 22, 1991"}));

        //Musicals
        getMoviefromList().add(new MovieInfo(new String[] {"Mamma Mia", "PG-13", "Meryl Streep, Pierce Brosnan", "July 18, 2008"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Mary Poppins Returns", "PG", "Emily Blunt, Lin-Manuel Miranda", "December 19, 2018"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Grease", "PG-13", "John Travolta, Olivia Newton-John", "June 16, 1978"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Singing in the Rain", "G", "Gene Kelly, Debbie Reynolds", "April 11, 1952"}));
        getMoviefromList().add(new MovieInfo(new String[] {"The Greatest Showman", "PG", "Hugh Jackman, Michelle Williams", "December 20, 2017"}));

        //Romance
        getMoviefromList().add(new MovieInfo(new String[] {"La La Land", "PG-13", "Ryan Gosling, Emma Stone", "December 25, 2016"}));
        getMoviefromList().add(new MovieInfo(new String[] {"The Notebook", "PG-13", "Ryan Gosling, Rachel McAdams", "June 25, 2004"}));
        getMoviefromList().add(new MovieInfo(new String[] {"A Star is Born", "R", "Lady Gaga, Bradley Cooper", "October 5, 2018"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Titanic", "PG-13", "Leonardo DiCaprio, Kate Winslet", "December 19, 1997"}));
        getMoviefromList().add(new MovieInfo(new String[] {"10 Things I Hate About You", "PG-13", "Heath Ledger, Julia Stiles", "March 31, 1999"}));

        //Comedy
        getMoviefromList().add(new MovieInfo(new String[] {"Mean Girls", "PG-13", "Lindsey Lohan, Jonathan Bennett", "April 30, 2004"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Bridesmaids", "R", "Kristen Wiig, Maya Rudolph", "May 13, 2011"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Deadpool", "R", "Ryan Reynolds, Morena Baccarin", "February 12, 2016"}));
        getMoviefromList().add(new MovieInfo(new String[] {"Step Brothers", "R", "Will Ferrell, John C. Reilly", "July 25, 2008"}));
        getMoviefromList().add(new MovieInfo(new String[] {"The Hangover", "R", "Zach Galifianakis, Bradley Cooper", "June 5, 2009"}));
    }

    public ArrayList<MovieInfo> getMoviefromList()
    {
        return movieList;
    }
    
    //Create genre arrayList    
    private void addGenreToList()
    {
        getGenrefromList().add(("Select Genre"));
        getGenrefromList().add(("Fantasy"));
        getGenrefromList().add(("Animated"));
        getGenrefromList().add(("Musicals"));
        getGenrefromList().add(("Romance"));
        getGenrefromList().add(("Comedy"));
    }
    
    public ArrayList<String> getGenrefromList()
    {
        return genreList;
    }
}