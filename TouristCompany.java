import java.util.*;
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
		 
		 public static boolean updateTouristPlaceName(String oldTouristPlaceName , String newTouristPlaceName){
			 
			 System.out.println("The Update method started");
			 
			boolean isTouristPlaceNameUpdated = false;
			
			for(int position=0 ; position<TouristPlaceNames.length;position++){
				
				if(TouristPlaceNames[position] == oldTouristPlaceName){
					TouristPlaceNames[position] = newTouristPlaceName;
				
				  isTouristPlaceNameUpdated = true;
			    }
	        }
			if(isTouristPlaceNameUpdated == false)
				System.out.println(oldTouristPlaceName + "not found");
		 
		    return isTouristPlaceNameUpdated;
		 }
		 public static boolean deleteTouristPlaceName(String delete){

			System.out.println("The Delete method started");
		
		boolean isTouristPlaceNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<TouristPlaceNames.length ; position++){
			if(TouristPlaceNames[position]!=delete){
				TouristPlaceNames[newPosition] = TouristPlaceNames[position];
				newPosition++;
			}
			else
				isTouristPlaceNameDeleted = true;
		}
			TouristPlaceNames = Arrays.copyOf(TouristPlaceNames,newPosition);
			
			if(!isTouristPlaceNameDeleted)
				System.out.println(delete+" not found");
		return isTouristPlaceNameDeleted;	
	} 

	}
	
	



