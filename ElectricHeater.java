class ElectricHeater{

	static boolean isConnected = false;
 
	public static boolean onOrOff(){
	System.out.println("The onOrOff method started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The Electric Heater is turned Onn..!");
	} else if(isConnected==true){
		    isConnected=false;
			System.out.println("The Electric Heater is turned Off");
		 }
			System.out.println("The onOrOff method ended");
		return isConnected ;

}

	

}





