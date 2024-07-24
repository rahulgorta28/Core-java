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
	
	}



