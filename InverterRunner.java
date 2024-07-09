	class InverterRunner{

	public static void main(String[] args){

	System.out.println("main started");

	boolean connect	 = Inverter.onOrOff();
	System.out.println("is Inverter Connected:" + connect);
	connect	= Inverter.onOrOff();
	System.out.println("is Inverter connected" + connect);
	System.out.println("main ended");


		}


		}