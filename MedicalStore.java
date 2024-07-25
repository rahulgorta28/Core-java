import java.util.*;
class MedicalStore{
	
	static String MedicineNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMedicineName(String MedicineName){
	
	boolean isMedicineNameAdded = false;
	
		if(index < MedicineNames.length){
		 if(MedicineName!= null){
			MedicineNames[index++] = MedicineName;
			
		}else
			System.out.println("The Medicine Name is invalid");
		}else
			System.out.println("Sorry Medicine name is full:");
		return isMedicineNameAdded = true;
}
		 public static void printMedicineNames(){
		 for(String MedicineName:MedicineNames){
		
		System.out.println("The Medicine Names are:" + MedicineName);
		
		}
		
	
		 }
		 
		 public static boolean updateMedicineName(String oldMedicineName , String newMedicineName){
			 
			 System.out.println("The Update method started");
			 
			boolean isMedicineNameUpdated = false;
			
			for(int position=0 ; position<MedicineNames.length;position++){
				
				if(MedicineNames[position] == oldMedicineName){
					MedicineNames[position] = newMedicineName;
				
				  isMedicineNameUpdated = true;
			    }
	        }
			if(isMedicineNameUpdated == false)
				System.out.println(oldMedicineName + "not found");
		 
		    return isMedicineNameUpdated;
		 }
		 public static boolean deleteMedicineName(String delete){

			System.out.println("The Delete method started");
		
		boolean isMedicineNameDeleted = false;
		int position, newPosition;
		for(position = 0 , newPosition = 0 ; position<MedicineNames.length ; position++){
			if(MedicineNames[position]!=delete){
				MedicineNames[newPosition] = MedicineNames[position];
				newPosition++;
			}
			else
				isMedicineNameDeleted = true;
		}
			MedicineNames = Arrays.copyOf(MedicineNames,newPosition);
			
			if(!isMedicineNameDeleted)
				System.out.println(delete+" not found");
		return isMedicineNameDeleted;	
	} 

	}
	
	



