class WashingMachine{

	static boolean isConnected = false;
 
	public static void turnOn(){
	System.out.println("The turnOn method started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The Washing Machine is turned Onn..!");
	}
	System.out.println("The turnOn method ended");
		return ;

}

	public static void turnOff(){

	System.out.println("The turnOff method is started");

         if(isConnected==true){
		    isConnected=false;
			System.out.println("The Washing Machine is turned Off");
		 }
		 System.out.println("The turnOff method is ended");
		 return;


}





}