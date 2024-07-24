class TouristCompany{
	
	static String TouristPlaceNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addTouristPlaceName(String TouristPlaceName){
	
	boolean isTouristPlaceNameAdded = false;
	
		if(index < TouristPlaceNames.length){
		 if(TouristPlaceName!= null){
			TouristPlaceNames[index++] = TouristPlaceName;
			
		}else
			System.out.println("The Tourist Place Name is invalid");
		}else
			System.out.println("Sorry Tourist place name is full:");
		return isTouristPlaceNameAdded = true;
}
		 public static void printTouristPlaceNames(){
		 for(String TouristPlaceName:TouristPlaceNames){
		
		System.out.println("The Product Names are:" + TouristPlaceName);
		
		}
		
	
		 }
	
	}



