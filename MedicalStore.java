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
	
	}



