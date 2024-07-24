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
	
	}



