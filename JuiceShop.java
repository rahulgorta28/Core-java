import java.util.*;
class JuiceShop{
	
	static String JuiceNames[] = {null,null,null,null,null,null};
	static int index;
	
	public static boolean addJuiceName(String JuiceName){
	
	boolean isJuiceNameAdded = false;
	
		if(index < JuiceNames.length){
		 if(JuiceName!= null){
			JuiceNames[index++] = JuiceName;
			
		}else
			System.out.println("The Juice Name is invalid");
		}else
			System.out.println("Sorry Juice name is full:");
		return isJuiceNameAdded = true;
}
		 public static void printJuiceNames(){
		 for(String JuiceName:JuiceNames){
		
		System.out.println("The Juice Names are:" + JuiceName);
		
		}
		
	
		 }
		 public static boolean updateJuiceName(String oldJuiceName , String newJuiceName){
			 
			 System.out.println("The Update method started");
			 
			boolean isJuiceNameUpdated = false;
			
			for(int position=0 ; position<JuiceNames.length;position++){
				
				if(JuiceNames[position] == oldJuiceName){
					JuiceNames[position] = newJuiceName;
				
				  isJuiceNameUpdated = true;
			    }
	        }
			if(isJuiceNameUpdated == false)
				System.out.println(oldJuiceName + "not found");
		 
		    return isJuiceNameUpdated;
		 }
		 public static boolean deleteJuiceName(String delete){

			System.out.println("The Delete method started");
		
		boolean isJuiceNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<JuiceNames.length ; position++){
			if(JuiceNames[position]!=delete){
				JuiceNames[newPosition] = JuiceNames[position];
				newPosition++;
			}
			else
				isJuiceNameDeleted = true;
		}
			JuiceNames = Arrays.copyOf(JuiceNames,newPosition);
			
			if(!isJuiceNameDeleted)
				System.out.println(delete+" not found");
		return isJuiceNameDeleted;	
	} 

	}

	
	



