package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.spotifylogic.Spotify;

class SpotifyRunner{

    public static void main(String[]music){
        boolean isSpotifyCreated = Spotify.createSpotifyAccount("rahul","rahul@gmail.com",9886883294L,"kgdf12","28/08/2020","male");
        if(isSpotifyCreated)
            Spotify.readSpotifyAccount();

    }

}
