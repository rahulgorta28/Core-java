class PvrMovie{
	static double ref = 0.0;
	public static double getprice(String movieName){
	
   
   if(movieName == "Avatar "){
	ref=300.0;
	return ref;
   }
   if(movieName == "Titanic"){
	ref=35.0;
	return ref;
   }
   if(movieName == "The Shawshank Redemption "){
	ref=400.0;
	return ref;
   }
   if(movieName == "The Godfather"){
	ref=300.0;
	return ref;
   }
   if(movieName == "The Dark Knight"){
	ref=400.0;
	return ref;
   }
   if(movieName == "Inception"){
	ref=500.0;
	return ref;
   }
   if(movieName == "The Lion King"){
	ref=550.0;
	return ref;
   }
   if(movieName == "Frozen"){
	ref=300.0;
	return ref;
   }
   if(movieName == "The Avengers"){
	ref=550.0;
	return ref;
   }
   if(movieName == " The Jungle Book"){
	ref=400;
	return ref;
   }
   if(movieName == " The Sound of Music"){
	ref=300.0;
	return ref;
   }
   if(movieName == "Star Wars"){
	ref=300.0;
	return ref;
   }
   if(movieName == " The Princess Bride"){
	ref=500.0;
	return ref;
   }
   if(movieName == " The Matrix"){
	ref=400.0;
	return ref;
   }
   if(movieName == "The Lord of the Rings"){
	ref=450.0;
	return ref;
   }
   if(movieName == "Pulp Fiction"){
	ref=400.0;
	return ref;
   }
   if(movieName == "The Good, the Bad and the Ugly"){
	ref=200.0;
	return ref;
   }
   if(movieName == "12 Angry Men "){
	ref=300.0;
	return ref;
   }
   if(movieName == "Schindler's List"){
	ref=400.0;
	return ref;
   }
   if(movieName=="Forrest Gump"){
   ref=450.0;
   return ref;
   
   }

   else {
   System.out.println(movieName + "not found");
   return ref;
   }






}






}