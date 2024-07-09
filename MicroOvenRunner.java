	class MicroOvenRunner{

	public static void main(String[] args){

	System.out.println("main started");

	boolean connect	= MicroOven.onOrOff();
	
	System.out.println("is Micro-oven connected:" + connect);
	 connect	= MicroOven.onOrOff();
	 System.out.println("is Micro-oven connected:" + connect);
	System.out.println("main ended");


		}


		}