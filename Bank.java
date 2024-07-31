class Bank{

    int bankId;
	String ifscCode;
	String swiftCode;
	String bankName;
	int noOfWorkers;
	String branchName;
	
	public void displayDetails(){
		System.out.println("Display method started");
		System.out.println("The Bank Id is:" + bankId);
		System.out.println("The Bank's IFSC code is:" + ifscCode);
		System.out.println("The Bank's swift code is:" + swiftCode);
		System.out.println("The Name of the Bank is:" + bankName);
		System.out.println("The No. of workers in a Bank is:" + noOfWorkers);
		System.out.println("The Branch name is:" + branchName);
		
		
	}
	

}