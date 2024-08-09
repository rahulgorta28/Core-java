package com.xworkz.bookmyshowapp.app;

import com.xworkz.bookmyshowapp.app.moviesinfo.Movie;

public class BookMyShow {
    Movie movie;

    public BookMyShow(Movie movie) {
        this.movie = movie;
    }
    public void movieDetails(){
        this.movie.movieDetails();
    }
}
