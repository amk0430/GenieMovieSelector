/**
 * Katrina Balestino
 * Amber Kirk
 */

public class MovieCntl {
    private final MovieListModel movieList;
    private final MovieListModel genreList;
    private final MovieViewer movieUI;
    private final int startIndex = 0;
    
    public MovieCntl(){
        genreList = new MovieListModel();
        movieList = new MovieListModel();
        movieUI = new MovieViewer(this, startIndex);
        movieUI.setVisible(true);
    }
    public MovieInfo getMovie(int index){
        return movieList.getMoviefromList().get(index);
    }    
    public MovieListModel getMovieList(){
        return movieList;
    }    
    public String getGenre(int index){
        return genreList.getGenrefromList().get(index);
    } 
    public MovieListModel getGenreList() {
        return genreList;
    }
}