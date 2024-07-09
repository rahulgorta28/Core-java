class WashingMachine{

	static boolean isConnected = false;
 
	public static boolean onOrOff(){
	System.out.println("The turnOn method started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The Washing Machine is turned Onn..");
	}else if(isConnected == true){
			isConnected=false;
			System.out.println("The Washing Machine is turned Off");
		 }
		 
			System.out.println("The turnOn method ended");
		return isConnected;
	}
	

}

	