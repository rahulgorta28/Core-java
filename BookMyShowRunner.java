package com.xworkz.bookmyshowapp;

import com.xworkz.bookmyshowapp.app.BookMyShow;
import com.xworkz.bookmyshowapp.app.moviesinfo.Movie;

public class BookMyShowRunner {

    public static void main(String[] args) {
        Movie movie = new Movie("Sujata Talkies","KGF",560);
        BookMyShow app = new BookMyShow(movie);
        app.movieDetails();

    }
}
