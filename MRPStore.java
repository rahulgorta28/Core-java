class MRPStore{
	
	static String AlcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addAlcoholName(String AlcoholName){
	
	boolean isAlcoholNameAdded = false;
	
		if(index < AlcoholNames.length){
		 if(AlcoholName!= null){
			AlcoholNames[index++] = AlcoholName;
			
		}else
			System.out.println("The Alcohol Name is invalid");
		}else
			System.out.println("Sorry Alcohol name is full:");
		return isAlcoholNameAdded = true;
}
		 public static void printAlcoholNames(){
		 for(String AlcoholName:AlcoholNames){
		
		System.out.println("The Alcohol Names are:" + AlcoholName);
		
		}
		
	
		 }
	
	}



