class IronBox{

	static boolean isConnected = false;
 
	public static boolean onOrOff(){
	System.out.println("The onOrOff method started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The IronBox is turned Onn..!");
	}
	else  if(isConnected==true){
		    isConnected=false;
			System.out.println("The IronBox is turned Off");
		 }
			 System.out.println("The onOrOff method is ended");
		 return isConnected;

}


}