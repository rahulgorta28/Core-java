class SpotifyRunner{
	
	public static void main(String[]music){
		
		
		boolean isSpotifyCreated = Spotify.createSpotifyAccount("varsha",null,"9886883294","kgdf12","28/08/2020");
		if(isSpotifyCreated == true)
		Spotify.readSpotifyAccount();
		
	}

}