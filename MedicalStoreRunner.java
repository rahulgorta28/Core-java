class MedicalStoreRunner{

	public static void main(String[] args){
	
	System.out.println("Main method started");
	
  boolean   isMedicineNameAdded	= MedicalStore.addMedicineName("Paracetamol");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Ibuprofen");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Amoxicillin");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Metformin");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Atorvastatin");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Omeprazole");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Albuterol");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Lisinopril");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Levothyroxine");
			isMedicineNameAdded	= MedicalStore.addMedicineName("Zolpidem");
  
			
			if(isMedicineNameAdded){
  
			MedicalStore.printMedicineNames();
  }
	
	
	}


}