import java.util.*;
class TeaPoint{
	
	static String TeaNames[] = {null,null,null,null,null,null};
	static int index;
	
	public static boolean addTeaName(String TeaName){
	
	boolean isTeaNameAdded = false;
	
		if(index < TeaNames.length){
		 if(TeaName!= null){
			TeaNames[index++] = TeaName;
			
		}else
			System.out.println("The Tea Name is invalid");
		}else
			System.out.println("Sorry Tea name is full:");
		return isTeaNameAdded = true;
}
		 public static void printTeaNames(){
		 for(String TeaName:TeaNames){
		
		System.out.println("The Tea Names are:" + TeaName);
		
		}
		
	
		 }
		 
		 public static boolean updateTeaName(String oldTeaName , String newTeaName){
			 
			 System.out.println("The Update method started");
			 
			boolean isTeaNameUpdated = false;
			
			for(int position=0 ; position<TeaNames.length;position++){
				
				if(TeaNames[position] == oldTeaName){
					TeaNames[position] = newTeaName;
				
				  isTeaNameUpdated = true;
			    }
	        }
			if(isTeaNameUpdated == false)
				System.out.println(oldTeaName + "not found");
		 
		    return isTeaNameUpdated;
		 }
		 public static boolean deleteTeaName(String delete){

			System.out.println("The Delete method started");
		
		boolean isTeaNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<TeaNames.length ; position++){
			if(TeaNames[position]!=delete){
				TeaNames[newPosition] = TeaNames[position];
				newPosition++;
			}
			else
				isTeaNameDeleted = true;
		}
			TeaNames = Arrays.copyOf(TeaNames,newPosition);
			
			if(!isTeaNameDeleted)
				System.out.println(delete+" not found");
		return isTeaNameDeleted;	
	} 

	}



