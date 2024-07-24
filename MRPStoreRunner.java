class MRPStoreRunner{

	public static void main(String[] args){
	
	System.out.println("Main method started");
	
  boolean   isAlcoholNameAdded	= MRPStore.addAlcoholName("Absolut Vodka");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Jack Daniel's Tennessee Whiskey");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Bacardi Rum");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Johnnie Walker Scotch Whisky");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Tanqueray Gin");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Patrón Tequila");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Hennessy Cognac");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Smirnoff Vodka");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Captain Morgan Spiced Rum");
			isAlcoholNameAdded	= MRPStore.addAlcoholName("Jameson Irish Whiskey");
  
			
			if(isAlcoholNameAdded){
  
			MRPStore.printAlcoholNames();
  }
	
	
	}


}