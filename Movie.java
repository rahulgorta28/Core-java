package com.xworkz.bookmyshowapp.app.moviesinfo;

public class Movie {
   public String theatreName;

    public String movieName;

    public long moviePrice;

    public Movie(String theatreName,String movieName, long moviePrice) {
        this.theatreName = theatreName;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
    }
    public void movieDetails(){
        System.out.println("The  movie name is:" + movieName);
        System.out.println("The movie price is:" + moviePrice);
        System.out.println("The theatre name is:" + theatreName);


    }


}

