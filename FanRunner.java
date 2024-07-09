	class FanRunner{

	public static void main(String[] args){

	System.out.println("main started");

	boolean connect	= Fan.onOrOff();
	System.out.println("is Fan connected:" + connect);
	connect	= Fan.onOrOff();
	System.out.println("is Fan connected" + connect);
	System.out.println("main ended");


		}


		}