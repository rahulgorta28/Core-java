class Inverter{

	static boolean isConnected = false;
 
	public static boolean onOrOff(){
	System.out.println("The onOrOff method started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The Inverter is turned Onn..!");
	}
	else if(isConnected==true){
		    isConnected=false;
			System.out.println("The Inverter is turned Off");
		 }
		System.out.println("The onOrOff method is ended");
		 return isConnected;

}

	


}





