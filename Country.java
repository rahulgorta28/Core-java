class Country{

    int countryId;
	int noOfStates;
	String pmOfCountry;
	String countryName;
	String population;
	
	public Country(int countryId,int noOfStates,String pmOfCountry,String countryName,String population){
		
		this.countryId = countryId;
		this.noOfStates = noOfStates;
		this.pmOfCountry = pmOfCountry;
		this.countryName = countryName;
		this.population = population;
	}
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println("The Country Id is:" + countryId);
		System.out.println("The No. of the states are:" + noOfStates);
		System.out.println("The Country Name is:" + countryName);
		System.out.println("The Population is:" + population);
		
		
	}
	

}