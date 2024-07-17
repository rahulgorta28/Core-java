class  InsurancePackageRun{

			static String anyThing = "hdf life insrance";
			    public static void main(String[] insrancename){
			     System.out.println("main started");
			
			double price = InsurancePackage.getPrice(anyThing);
				System.out.println(anyThing + "price is " + price);
				System.out.println("main is ended");

}


}