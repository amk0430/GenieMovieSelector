/**
 * Katrina Balestino
 * Amber Kirk
 */
public class MovieInfo {
    private final String movieTitle;
    private final String rating;
    private final String leadActors;
    private final String releaseDate;
    public MovieInfo(String[] movieInfo)
    {
        movieTitle = movieInfo[0];
        rating = movieInfo[1];
        leadActors = movieInfo[2];
        releaseDate = movieInfo[3];
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public String getRating() {
        return rating;
    }
    public String getLeadActors() {
        return leadActors;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    @Override
    public String toString() {
        return " Movie Title: " + movieTitle + "\n Rating: " + rating + "\n Lead Actors: " + leadActors + "\n Release Date: " + releaseDate;
    }    
}
